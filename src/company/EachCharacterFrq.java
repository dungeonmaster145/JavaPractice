package company;

import java.util.HashMap;

public class EachCharacterFrq {

    public static void main(String[]args) {

        String s1="aaaaabbbeeeccfff";
        HashMap<Character,Integer> h=new HashMap<>();
        for(int i=0;i<s1.length();i++)
        {
            char ch=s1.charAt(i);
            h.put(ch, h.getOrDefault(ch,0)+1);
        }
        System.out.println(h.keySet());
    }
}
