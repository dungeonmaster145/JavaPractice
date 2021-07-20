package com.CarBrand;

public class CarFactory {

    public BrandName Factory(String factoryname){
        if(factoryname==null || factoryname.isEmpty())
            return null;
        else if("Bugatti".equalsIgnoreCase(factoryname))
            return new Bugatti();
        else if("Mercedes".equalsIgnoreCase(factoryname))
            return new Mercedes();

        return new CarFactoryNotFound();
    }
}
