package com.FactoryPattern;

class Mercedes implements CarBrand
{

    public void BrandName(){
        System.out.println("The Brand is Mercedes");
    }
}

class Bugatti implements CarBrand{

    @Override
    public void BrandName () {
        System.out.println("The Brand is Bugatti");
    }
}

class BMW implements CarBrand
{
    @Override
    public void BrandName () {
        System.out.println("The Brand is BMW");
    }
}
class Nothing implements CarBrand{
    @Override
    public void BrandName () {
        System.out.println("Please enter a valid brandname");
    }
}
class CarFactory{

    public CarBrand FactoryName(String s){
        if(s.isEmpty() || s==null)
            return new Nothing();
        else if("Mercedes".equalsIgnoreCase(s))
            return new Mercedes();
        else if("BMW".equalsIgnoreCase(s))
            return new BMW();
        else if("Bugatti".equals(s))
            return new Bugatti();

        return new Nothing();
    }
}


public class Main {



    public static void main (String[] args) {
        CarFactory carFactory=new CarFactory();
        CarBrand carBrand=carFactory.FactoryName("BMW");
        carBrand.BrandName();
    }
}
