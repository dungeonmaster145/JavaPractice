package company;


import java.util.Stack;

public class BinaryTreeConstructor {

    public static class Node
    {
        int data;
        Node left;
        Node right;

        Node(int data,Node left,Node right){
            this.data=data;
            this.left=left;
            this.right=right;
        }
    }
    public static class StatePair{

        Node node;
        int state;
        StatePair(Node node,int state){
            this.state=state;
            this.node=node;
        }
    }
    public static void display(Node node){
        if(node==null)
            return;
        String str="";
        if(node.left==null)
            str+=".";
        else
            str+=node.left.data+"";
        str+="<-" +node.data + "->";
        if(node.right==null)
            str+=".";
        else
            str+=node.right.data+"";
        System.out.println(str);

        display(node.left);
        display(node.right);
    }
    public static void main(String[]args){
        Integer arr[]={50,25,12,null,null,37,30,null,null,null,75,62,null,70,null,null,87,null,null};
        Stack<StatePair> st=new Stack<>();
        Node root=new Node(arr[0],null,null);
        StatePair rootpair=new StatePair(root,1);
        st.push(rootpair);
        int index=0;
        while(st.size()>0){
           StatePair top=st.peek();
           if(top.state==1){
                index++;
                if(arr[index]!=null)
                {
                    Node leftnode=new Node(arr[index],null,null);
                    top.node.left=leftnode;
                    StatePair leftpart=new StatePair(top.node.left,1);
                    st.push(leftpart);




                }
                else{
                    top.node.left=null;
                }
               top.state++;
           }
           else if(top.state==2){
               index++;
               if(arr[index]!=null)
               {
                   Node rightnode=new Node(arr[index],null,null);
                   top.node.left=rightnode;
                   StatePair rightpart=new StatePair(top.node.left,2);
                   st.push(rightpart);




               }
               else{
                   top.node.right=null;
               }
               top.state++;
           }

           else{
               st.pop();
           }
        }
        //System.out.println(st);
        display(root);

    }
}
