package company;
import java.util.*;
public class Hashing {

    public static void main(String[]args){

        HashMap<String,Integer> hm=new HashMap<>();

        hm.put("India",135);
        hm.put("France",140);
        hm.put("China",200);
        hm.put("USA",400);



        Set<String> keyset=hm.keySet();
        System.out.print(keyset+"\n");
        for(String key:keyset)
        {
            System.out.println(key+" "+hm.get(key));
        }


    }

}
