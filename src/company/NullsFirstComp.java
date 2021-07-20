package company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class College {

    int id;
    String name;
    String university;


    College(int id,String name,String university){
        this.id=id;
        this.name=name;
        this.university=university;
    }

    public College() {

    }

    public  String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public  String getName() {
        return name;
    }


}


public class NullsFirstComp {

    public static void main(String[] args)
    {

        List<College> li=new ArrayList<>();
        li.add(new College(1,null,null));
        li.add(new College(2,"ABC","GHJ"));
        li.add(new College(3,"PAR","JUYS"));
        li.add(new College(4,"XVN","akj"));
        li.add(new College(5,"LMN","akshd"));

        Comparator<College> cmp=Comparator.comparing(College::getName,Comparator.nullsFirst(String::compareTo));
        Collections.sort(li,cmp);
        for(College x:li){
            System.out.println(x.id+" "+x.name+" "+x.university);
        }
        Comparator<College> cmp1=Comparator.comparing(College::getName,Comparator.nullsLast(String::compareToIgnoreCase));
        Collections.sort(li,cmp1);
        System.out.println("After we use nulls last ");
        for(College x:li){
            System.out.println(x.id+" "+x.name+" "+x.university);
        }


    }
}
