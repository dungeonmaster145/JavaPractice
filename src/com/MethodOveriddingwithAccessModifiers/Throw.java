package com.MethodOveriddingwithAccessModifiers;

public class Throw {

    public static void legal(int age)
    {
        if(age<18)
            throw new ArithmeticException("Not fit to vote");
        else
            System.out.println("Fit to vote");
    }
    public static void main(String[]args){

        String codes[]={"abc","pqr","xyz"};
        String s="178";
        char ch=s.charAt(0);
        System.out.println(codes[ch-'0']);
    }
}
