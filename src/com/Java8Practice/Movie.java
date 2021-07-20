package com.Java8Practice;

import java.util.ArrayList;
import java.util.Collections;

public class Movie implements Comparable<Movie>
{
    private double rating;
    private String name;
    private int year;

    public Movie (double rating, String name, int year) {
        this.rating = rating;
        this.name = name;
        this.year = year;
    }

    public double getRating () {
        return rating;
    }

    public void setRating (double rating) {
        this.rating = rating;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getYear () {
        return year;
    }

    public void setYear (int year) {
        this.year = year;
    }

    @Override
    public String toString () {
        return "Movie{" +
                "rating=" + rating +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
    public int compareTo(Movie m){
        return (int)this.getRating()-(int)m.getRating();
    }

    public static void main (String[] args) {

        ArrayList<Movie> moviename=new ArrayList<>();
        moviename.add(new Movie(7.6,"Shawshank",1996));
        moviename.add(new Movie(7.4,"nk",1993));
        moviename.add(new Movie(7.3,"awshank",1994));

        Collections.sort(moviename);

        for(Movie m:moviename)
            System.out.println(m);
    }
}
