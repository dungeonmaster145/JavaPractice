package com.MethodOveriddingwithAccessModifiers;

public class BeanCall {

    public static void main(String[]args){

        Bean obj=new Bean();
        obj.setPhone_number(0);
        obj.setName("Mayank");

        System.out.println(obj.getName());
        System.out.println(obj.getPhone_number());
    }
}
