package company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{

    int id;
    String name;
    Student(int id,String name){
        this.id=id;
        this.name=name;
    }


    @Override
    public int compareTo(Student o) {
        if(this.id>o.id)
            return 1;
        else if(this.id<o.id)
            return -1;
        else
            return 0;
    }
}


public class CollectionSort {


    public static void main(String[] args) {
        List<Student> st=new ArrayList<>();
        st.add(new Student(1,"Mayank"));
        st.add(new Student(2,"Akshit"));
        st.add(new Student(3,"XYZ"));
        st.add(new Student(4,"ABC"));
        Collections.sort(st);
        for(Student s:st){
            System.out.println(s.id+" "+s.name);
        }
        Collections.sort(st,Collections.reverseOrder());
        for(Student s:st){
            System.out.println(s.id+" "+s.name);
        }
    }

}
