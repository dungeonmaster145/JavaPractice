package com.PriorityQueue;

import java.util.PriorityQueue;

public class PQ {

    public static void main(String[]args){

        int a[]={1,3,5,6,0,2,99,54,89};
        PriorityQueue <Integer> pq=new PriorityQueue<>();
        for(int x:a){
            pq.add(x);
        }
        System.out.println(pq);
    }

    public static class StringCalculator {
        public int add(String input) {
            String[] numbers = input.split(",|\n");

            if (input.isEmpty()) {
                return 0;
            } else if (numbers.length > 1) {
                return getSum(numbers);
            }
            return stringToInt(input);
        }

        private int getSum(String[] numbers) {
            int sum = 0;
            for (String currentNumber:numbers) {
                if (stringToInt(currentNumber) > 1000) {
                    continue;
                }
                sum += stringToInt(currentNumber);
            }
            return sum;
        }

        private int stringToInt(String number) {
            int num = Integer.parseInt(number);
            if (num < 0) {
                throw new IllegalArgumentException("Negative input!");
            } else {
                return num;
            }
        }

    }
}
