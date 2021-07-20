package com.MethodReference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person {
    String name;
    Integer age;

    public Person (String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName () {
        return name;
    }

    public Integer getAge () {
        return age;
    }

}
class ComaprisonProvider
{ public int CompareByName(Person p1, Person p2){
    return p1.getName().compareToIgnoreCase(p2.getName());
}
    public int compareByAge(Person p1, Person p2){
        return p1.getAge()-p2.getAge();
    }}


public class MainClass {

    public static void main (String[] args) {

        ArrayList<Person> persons=new ArrayList<>();
        persons.add(new Person("vicky", 24));
        persons.add(new Person("poonam", 25));
        persons.add(new Person("sachin", 19));
        ComaprisonProvider comaprisonProvider=new ComaprisonProvider();
        Collections.sort(persons,comaprisonProvider::CompareByName);
        persons.stream()
                .map(x->x.getName())
                .forEach(System.out::println);
        System.out.println();
        Collections.sort(persons,comaprisonProvider::compareByAge);
        persons.stream()
                .map(x->x.getAge())
                .forEach(System.out::println);


    }
}

