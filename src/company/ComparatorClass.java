package company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Students implements Comparator{
    int id;
    String name;

    Students(int id, String name){
        this.id=id;
        this.name=name;
    }

    Students(){}


    @Override
    public int compare(Object o1, Object o2) {
        Students s1=(Students)o1;
        Students s2=(Students)o2;

        if(s1.id>s2.id)
            return 1;
        else if(s1.id<s2.id)
            return -1;
        else
            return 0;
    }
}

public class ComparatorClass {

    public static void main(String[] args) {

        List<Students> st=new ArrayList<>();
        st.add(new Students(3,"Mayank"));
        st.add(new Students(2,"Akshit"));
        st.add(new Students(1,"Hema"));
        st.add(new Students(4,"Girja"));

        Collections.sort(st,new Students());

        for(Students x:st){
            System.out.println(x.id+" "+x.name);
        }

    }
}
