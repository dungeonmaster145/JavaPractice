package com.Polymorphism;

class Father{

    {
        System.out.println("Parent class Instance initializer");
    }
    Father(){
        System.out.println("Father class constructor is invoked");
    }
}


public class IIploy extends Father {

    {
        System.out.println("Child class instance initializer");
    }
    IIploy(){

        System.out.println("We are in child class constructor");
        //super();
    }
    public static void main(String[]args){

        IIploy o=new IIploy();
    }

}
