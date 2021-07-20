package com.Java8Practice;

import java.util.function.Function;

public class Functions {

    public static void main (String[] args) {
       Function<Integer,Double> ans=a->a*5.0;

        ans= ans.andThen(a->a/5.0);
       ans=ans.compose(a->a*3);

        System.out.println(ans.apply(10));
    }
}
