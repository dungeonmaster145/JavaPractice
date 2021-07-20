package com.MethodReference;

public class Stuff {

    public static void main (String[] args) {

        SomeWork obj=new SomeWork();
        Main o=SomeWork::doingSomething;
        o.doer();
        System.out.println();
        Main o1=obj::nonStatictask;

    }
}
