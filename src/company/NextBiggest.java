package company;

import java.util.*;
public class NextBiggest {

    public static int BinarySearch(int arr[],int ele)
    {
        int lower=0;
        int upper=arr.length-1;
        int mid=0;
        if(arr.length%2==0)
        {
             mid=(lower+upper)/2;
        }
        else
            {
                mid=(lower+upper)/2+1;
            }

        System.out.println(mid);

        Arrays.sort(arr);
        int i=0;
        if(ele==arr[mid])
            return mid;
        int index=0;
        if(ele<arr[mid])
        {
            while(i<mid)
            {
                if(arr[i]==ele)
                {
                    index=i;
                    return index;
                }
                i++;
            }
        }
        int idx=mid+1;
        if(ele>arr[mid])
        {
            while(idx<upper)
            {
                if(arr[idx]==ele)
                {
                    index=idx;
                    return index;
                }
                idx++;
            }
        }
        return -1;
    }

    public static void main(String[]args)
    {
        int arr[]={5,6,5,8,79,56,79};
        int ele=79;
        int result=BinarySearch(arr,ele);
        if(result==-1)
            System.out.println("Element was not found");
        else
            System.out.println("Element found at "+result+" index:");
    }

}
