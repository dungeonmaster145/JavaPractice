package company;

import java.util.*;
public class Hashset {

    public static void main(String[]args)
    {
        int arr[]={2,2,2,0,1};
        Arrays.sort(arr);
        int ar[]=new int[arr.length];
        for(int x:arr)
        {
            System.out.println(x);
        }
        HashSet<Integer> h=new HashSet<>();
         for(int i=0;i<arr.length;i++)
         {
             h.add(arr[i]);
         }
         System.out.println(h);
    }
}
