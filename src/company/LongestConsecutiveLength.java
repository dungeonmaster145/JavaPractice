package company;

import java.util.HashMap;
import java.util.Scanner;

public class LongestConsecutiveLength {
    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];

        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();

        HashMap<Integer,Boolean> hmap=new HashMap<>();
        for(int x:a){

            hmap.put(x,true);
        }
        for(int x:a){
            if(hmap.containsKey(x-1))
                hmap.put(x,false);
        }
        int maxl=0;
        int maxsp=0;
        for(int x:a){
            if(hmap.get(x)==true)
            {
                int sp=x;
                int l=1;
                while(hmap.containsKey(x+l)){
                    l++;
                }
                if(maxl<l)
                {
                    maxl=l;
                    maxsp=sp;
                }
            }


        }
        for(int i=0;i<maxl;i++)
        {
            System.out.println(maxsp+i);
        }
    }
}
