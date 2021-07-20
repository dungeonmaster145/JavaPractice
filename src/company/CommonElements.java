package company;

import java.util.*;

public class CommonElements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int a1[] = new int[n1];
        for (int i = 0; i < n1; i++) {
            a1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();

        int a2[] = new int[n2];


        for (int i = 0; i < n2; i++) {
            a2[i] = sc.nextInt();
        }
        Arrays.sort(a1);
        Arrays.sort(a2);
        HashMap<Integer, Integer> hp = new HashMap<>();
        for (int i = 0; i < n1; i++) {
            hp.put(a1[i], hp.getOrDefault(a1[i],0)+1);
        }
        //System.out.println(hp);
       for(int val:a2)
       {
           if(hp.containsKey(val) && hp.get(val)>0)
           {
               System.out.println(val);
               hp.put(val, hp.getOrDefault(val,0)-1);
           }
       }
    }
}
