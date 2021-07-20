package com.MethodReference;

class MyMessages{
    //String message;
    MyMessages(String message){
        System.out.println(message);
        //this.message=message;
    }
}

public class ConstructorReference {

    public static void main (String[] args) {
        Message obj=MyMessages::new;
        obj.getMessage("Hello World");
    }

}

