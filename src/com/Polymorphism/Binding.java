package com.Polymorphism;

public class Binding {

    private void run(){
        int a = 5;
        System.out.println("The value is -->"+a);
    }
    public static void main(String[]args){

        Binding
                o=new Binding();
        o.run();
        //the above is an example of static binding
    }
}
