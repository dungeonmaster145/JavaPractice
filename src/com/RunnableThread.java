package com;

public class RunnableThread implements Runnable{

    public void run(){
        System.out.println("The name of the thread is "+Thread.currentThread().getName());
    }

    public static void main (String[] args) {

        for(int i=1;i<5;i++) {
            Thread t = new Thread(new RunnableThread());
             t.start();
        }
    }
}
