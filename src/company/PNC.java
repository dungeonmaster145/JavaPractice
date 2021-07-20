package company;

import java.util.Scanner;

public class PNC {

    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        PC(s,"");
    }
    public static void PC(String s,String ans){

        if(s.length()<=0)
        {
            System.out.println(ans);
            return;
        }

        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            String first=s.substring(0,i);
            String rest=s.substring(i+1);
            String remain=first+rest;
            PC(remain,ans+c);
        }


    }
}
