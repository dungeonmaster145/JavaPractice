import java.util.*;
public class HigestFrequency {

    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.nextLine();
        HashMap<Character,Integer> hf=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            hf.put(ch, hf.getOrDefault(ch,0)+1);
        }
        int max=Integer.MIN_VALUE;
        System.out.println(hf);
       Set<Character> keyset=hf.keySet();
       char c='a';
       for(Character ch:keyset)
       {

           if(hf.get(ch)>max)
           {
               max=hf.get(ch);
               c=ch;
           }

       }
       System.out.println(c+" "+max);
    }
}
