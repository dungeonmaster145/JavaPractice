package com.Java8Practice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntegerStream {

    public static void main (String[] args) throws IOException {
        IntStream.range(1, 12)
                .forEach(System.out::println);
        System.out.println();
        Integer ans = IntStream.range(99, 111).skip(4).sum();
        System.out.println(ans);
        Stream.of("Mayank", "Akshit", "Alberto").sorted().findFirst()
                .ifPresent(System.out::println);
        System.out.println();
        String names[] = {"Mayank", "", "Amanda", "Mia", "Lana", "Sunny"};
        Arrays.stream(names).filter(x -> x.startsWith("M")).sorted()
                .forEach(System.out::println);
        Integer arr[] = {1, 2, 6, 0, 8, 9, 23, 15, 16};
        System.out.println();
        Arrays.stream(arr).map(x->Math.pow(x,2)).forEach(System.out::println);
        System.out.println();
        List<String> nam=Arrays.asList("Mayank", "Akshit", "Alberto");
        nam.stream().map(name->name.toLowerCase())
                .filter(x->x.startsWith("m"))
                .forEach(System.out::println);
        System.out.println();



        Float da[]={1.6f,5.8f,6.4f,3.2f};
       float total= Arrays.stream(da).reduce(0.0f,(a,b)->a+b);
        System.out.println(total);
        System.out.println();
        IntSummaryStatistics astram=IntStream.of(2,6,9,9,9,3,1,4,5)
                .summaryStatistics();
        System.out.println(astram);
    }
}