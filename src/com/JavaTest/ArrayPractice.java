package com.JavaTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayPractice {

    public static void main (String[] args) {

        int arr[]={-2, 0, 1, 3};
        int target=2;

        int result=arr[0]+arr[1]+arr[arr.length-1];
        Arrays.sort(arr);
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<arr.length-2;i++)
        {
            List<Integer> val=new ArrayList<>();
            int a_pointer=i+1;
            int b_pointer=arr.length-1;
            while(a_pointer<b_pointer){
                int currSum=arr[i]+arr[a_pointer]+arr[b_pointer];

                if(currSum<target){
                         val.add(arr[i]);
                         val.add(arr[a_pointer]);
                         val.add(arr[b_pointer]);
                }
                if(currSum>=target)
                    b_pointer--;
                else
                    a_pointer++;
            }
            ans.add(val);
        }
        System.out.println(ans);
    }
}
