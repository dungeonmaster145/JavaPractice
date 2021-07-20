package com.Java8Practice;


interface Function{
   // void funct();
    int  sum(int a,int b);

}
public class GFG {

    public static void main (String[] args) {
       // Function o=()-> System.out.println("Hello There");

        //o.funct();
        Function sum=(a,b)->{
            return a+b;
        };
        System.out.println(sum.sum(5,6));;
    }
}
