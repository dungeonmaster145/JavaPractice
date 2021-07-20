import java.util.HashMap;
import java.util.Map;

public class FrequencyEachCharacter {



    public static void main(String ...s) {
        String s1="aaaaabbbeeeccfff";
        Map<Character,Integer> map = new HashMap<>();
        for(Character c: s1.toCharArray()) {
            if(map.containsKey(c)) map.replace(c, map.get(c)+1);
            else map.put(c, 1);
        }

        map.forEach((k,v)->{
            System.out.print(k+"-"+v+" ");
        });
    }

}