package com.CarBrand;

public class CarFactoryNotFound implements BrandName{

    @Override
    public void Brandname () {
        System.out.println("We could not find the brandname");
    }
}
