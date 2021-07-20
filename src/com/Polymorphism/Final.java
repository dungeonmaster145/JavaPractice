package com.Polymorphism;


public class Final {

    static final String name;
    static{
        name="Mayank";
        System.out.println("the name is --->"+name);
    }
   Final(){
        System.out.println("We are in the construnctor");
    }
    public static void main(String[]args){

        Final o=new Final();
    }


}
