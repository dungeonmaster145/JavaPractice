package com.Singleton;




class SingletonClass {

    private static SingletonClass singletonClass=null;

    String detail;
    private SingletonClass(){
        detail="My name is Mayank Joshi";
    }

    public static SingletonClass getInstance(){
        if(singletonClass==null){
            singletonClass=new SingletonClass();


        }
        return singletonClass;
    }

}

public class Singleton{

    public static void main (String[] args) {

        SingletonClass s1=SingletonClass.getInstance();
        SingletonClass s2=SingletonClass.getInstance();

        System.out.println("The details are as follows "+s1.detail);
        System.out.println("The details are as follows "+s2.detail);

        s1.detail=(s1.detail).toUpperCase();

        System.out.println("The second object is called and the value of the string is "+s2.detail);


    }
}
