package company;

import java.util.*;
import java.util.Scanner;

// Write your code here. DO NOT use an access modifier in your class declaration.
class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String arr[]=new String[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextLine();

        for(int i=0;i<n;i++)
        {
            System.out.println (isBalanced(arr[i]));
        }



    }
    static boolean isBalanced(String s){

        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='{' || ch=='(' || ch=='[')
                st.push(ch);
            else{
                if(st.empty()==true)
                    return false;

                st.pop();
            }

        }
        return st.empty();
    }

}
