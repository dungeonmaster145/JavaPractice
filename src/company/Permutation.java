package company;
import java.util.*;
public class Permutation {

    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        permutation(s,"");

    }

    public static void permutation(String s,String ans){

        if(s.length()<=0)
        {
            System.out.println(ans);
            return;
        }


        //if(s.length()==1)



        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            String leftpart=s.substring(0,i);
            String rightpart=s.substring(i+1);
            String remaining=leftpart+rightpart;
            permutation(remaining,ans+ch);
        }

    }

}
