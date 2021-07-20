package com.MethodOveriddingwithAccessModifiers;

public class Bean {

    private String name;
    private int phone_number;

    public String getName()
    {
       return name;

    }
    public int getPhone_number(){
        return phone_number;
    }
    void setName(String name){
        this.name=name;
    }
    void setPhone_number(int phone_number){
        this.phone_number=phone_number;
    }
}
