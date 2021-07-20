package com.Comparisons;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Movie implements Comparable<Movie>
{
    int rating;
    String name;
    int year;

    Movie(int rating,String name,int year){
        this.rating=rating;
        this.name=name;
        this.year=year;
    }

    @Override
    public int compareTo (Movie o) {
        return this.rating-o.rating;
    }
}

class YearCompare implements Comparator<Movie>{

    public int compare(Movie m1, Movie m2){

        return m1.year-m2.year;

    }
}

public class Main {

    public static void main (String[] args) {
        List<Movie> list=new ArrayList<>();
        list.add(new Movie(8,"Force Awakens", 2015));
        list.add(new Movie(9,"Star Wars",  1977));
        list.add(new Movie(7,"Empire Strikes Back", 1980));
        list.add(new Movie(6,"Return of the Jedi",  1983));

        Collections.sort(list);


        YearCompare yearCompare=new YearCompare();

        Collections.sort(list,yearCompare);

        for (Movie m:list)
            System.out.println(m.name+" "+m.year);
    }


}
