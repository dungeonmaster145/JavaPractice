package company;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {

    public static void main(String[] args) {

        List<College> li=new ArrayList<>();
        li.add(new College(1,"IIT","IIT"));
        li.add(new College(2,"NIT","NITS"));
        li.add(new College(3,"BITS","BIRLA"));
        li.add(new College(4,"VIT","VIT Vellore"));
        //sorting done on the basis of name;
        Comparator<College> cmp=Comparator.comparing(College::getName);
        Collections.sort(li,cmp);
        for(College x:li){
            System.out.println(x.id+" "+x.name);
        }
        //sorting done on the basis of Id
        Comparator<College> cmp1=Comparator.comparing(College::getId);
        Collections.sort(li,cmp1);
        for(College x:li){
            System.out.println(x.name+" "+x.id+" <--This sorting is done on the basis of ID");
        }
        //sorting on the basis of university

        Comparator<College> cmp2=Comparator.comparing(College::getUniversity);
        Collections.sort(li,cmp2);
        for(College c:li){
            System.out.println(c.id+"-"+c.name+"-"+c.university+" <--This sorting is done on the basis of university");
        }

    }
}
