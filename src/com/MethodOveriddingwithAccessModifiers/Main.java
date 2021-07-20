package com.MethodOveriddingwithAccessModifiers;

abstract class Shape{

    abstract void Draw();
}

class Rectangle extends Shape
{

    void Draw(){
        System.out.println("Rectangle");
    }

}

public class Main {
    public static void main(String[]args){

        Rectangle obj=new Rectangle();
        obj.Draw();
    }
}
