package com;

public class MultiThread extends Thread{

    public void run(){
        System.out.println("The thread is "+Thread.currentThread().getName());
    }

    public static void main (String[] args) {

        for(int i=1;i<5;i++){
            MultiThread t=new MultiThread();
            //System.out.println("The thread is "+Thread.currentThread().getId());
            t.start();
        }
    }
}
