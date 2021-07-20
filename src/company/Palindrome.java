package company;
import java.util.*;
public class Palindrome {

    static boolean isPalindrome(String str,int h,int l)
    {
        while(l<h)
        {
            if(str.charAt(l)!=str.charAt(h))
            {
                return false;

            }
            l++;
            h--;
        }
        return true;
    }
    static int PossibleByRemovingChar(String str)
    {
        int low=0;
        int high=str.length()-1;
        while(low<high)
        {
            if(str.charAt(low)==str.charAt(high))
            {
                low++;
                high--;
            }
            else
                {
                    if(isPalindrome(str,high,low+1))
                        return low;
                    if(isPalindrome(str,high-1,low))
                        return high;
                    return -3;
                }

        }
        return -1;
    }

    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int index=PossibleByRemovingChar(str);
        if(index==-3)
        {
            System.out.println("Not possible by removing any character");
        }
        else if(index==-1)
        {
            System.out.println("It is already a palindrome");

        }
        else
            {
                System.out.println("The String is a palindrome at"+index);
            }

    }
}
