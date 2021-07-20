package com.OptionalClass;

import java.util.Optional;

public class OptionalEx {

    public static void main (String[] args) {
        String arr[]=new String[10];
        Optional<String> nullchecker=Optional.ofNullable(arr[5]);
        if(nullchecker.isPresent()){
            System.out.println(arr[5]);
        }
        else
        {
            System.out.println("The value is null here");
        }
    }
}
