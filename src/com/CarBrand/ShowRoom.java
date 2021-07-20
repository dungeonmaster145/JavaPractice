package com.CarBrand;

public class ShowRoom {

    public static void main (String[] args) {

        CarFactory carFactory=new CarFactory();
        BrandName b=carFactory.Factory("Audi");
        b.Brandname();
    }
}
