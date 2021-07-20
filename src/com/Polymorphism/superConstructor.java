package com.Polymorphism;

class P{


     P(){
       // this.name=name;
    System.out.println("Hello Hi");
    }
}



public class superConstructor extends P
{
    String name;
    superConstructor(String name){
        super();
        this.name=name;

    }
    void display(){
        System.out.println("The value of name is "+name);
    }
    public static void main(String[]args){

        superConstructor obj=new superConstructor("Akshit is there");
        obj.display();
    }

}
