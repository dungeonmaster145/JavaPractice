package com.Polymorphism;

public class InstanceInitializer {

    String name;int a;
    InstanceInitializer()
    {
        System.out.println("We are in the constructor");

    }
    {
        name="Mayank Joshi";
        a=2+3;
        System.out.println("The name is -->"+name);
        System.out.println(a);
    }


    public static void main(String[]args){

        InstanceInitializer o=new InstanceInitializer();
        InstanceInitializer o1=new InstanceInitializer();
        InstanceInitializer o2=new InstanceInitializer();
        InstanceInitializer o3=new InstanceInitializer();
        InstanceInitializer o4=new InstanceInitializer();

    }
}
