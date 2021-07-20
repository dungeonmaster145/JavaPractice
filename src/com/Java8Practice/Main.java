package com.Java8Practice;

import company.ComparatorExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {

    int id;
    String name;
    int rollNo;

    public Student (int id, String name, int rollNo) {

        this.id = id;
        this.name = name;
        this.rollNo = rollNo;
    }

    public int getId () {
        return id;
    }

    public void setId (int id) {
        this.id = id;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getRollNo () {
        return rollNo;
    }

    public void setRollNo (int rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public String toString () {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }


}
class SortByid implements Comparator<Student>
{

    public int compare(Student s1,Student s2){
        return s1.getId()-s2.getId();
    }
}
class SortByName implements Comparator<Student>
{
    public int compare(Student s1,Student s2){
        return s1.getName().compareToIgnoreCase(s2.getName());
    }
}
public class Main{
    public static void main (String[] args) {

        ArrayList<Student> name=new ArrayList<>();
              name.add(new Student(1,"Mayank",25877));
              name.add(new Student(2,"Akshit",256987));
              name.add(new Student(3,"POPqoiweh",123344));
              name.add(new Student(4,"KLHSdb",1231231));


        Collections.sort(name,new SortByid());
        for(Student x:name){
            System.out.println(x.toString());

        }
        System.out.println();
        Collections.sort(name,new SortByName());
        for(Student x:name){
            System.out.println(x.toString());
        }
    };
}
