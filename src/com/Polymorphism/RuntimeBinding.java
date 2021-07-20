package com.Polymorphism;

class Animal{

    void animal(){
        System.out.println("This is an animal");
    }
}

public class RuntimeBinding extends Animal{

    void animal(){
        System.out.println("this is a dog");
    }
    public static void main(String[]args){

        Animal a=new RuntimeBinding();
        a.animal();
    }
}
