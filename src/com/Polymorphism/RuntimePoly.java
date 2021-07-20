package com.Polymorphism;

class X{

    void run(){
        System.out.println("This is a parent class constructor");
    }
}


public class RuntimePoly extends X{
    void run(){
        System.out.println("This is child class");
    }
    public static void main(String[]args){

        X a=new RuntimePoly(); //reference variable parent class magar child class constructor call ho rha hai.
        a.run();
    }
}
