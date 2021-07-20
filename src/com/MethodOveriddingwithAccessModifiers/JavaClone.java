package com.MethodOveriddingwithAccessModifiers;

public class JavaClone implements Cloneable
{

    String name;
    JavaClone(String name)
    {
        this.name=name;
    }
    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }

    public static void main(String[]args) throws CloneNotSupportedException {

        JavaClone obj=new JavaClone("Mayank");
        JavaClone obj1=(JavaClone)obj.clone();

        System.out.println(obj.name);
        System.out.println(obj1.name);

    }

}
