package com.JavaTest;

import java.nio.Buffer;

public class Strings {

    public static void SimpleString(String s1){
        s1=s1+" Joshi";
        //System.out.println(s1);
    }
    public static void Builders(StringBuilder s2){
        s2.append(" Joshi");
       // System.out.println(s2);
    }
    public static void Buffers(StringBuffer s3){
        s3.append(" Joshi");
       // System.out.println(s3);
    }

    public static void main (String[] args) {
        Strings o=new Strings();

        String s="CR";
        SimpleString(s);
        System.out.println(s);
        StringBuilder sb=new StringBuilder("Akshit");
        Builders(sb);
        System.out.println(sb);
        StringBuffer byffer=new StringBuffer("Hema");
        Buffers(byffer);
        System.out.println(byffer);

    }
}
