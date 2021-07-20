package com;

import java.util.concurrent.*;

class MyRunnable implements Runnable{
    private final long waitime;
    MyRunnable(long waitime){
        this.waitime=waitime;
    }

    @Override
    public void run () {
        try{
            Thread.sleep(waitime);
            System.out.println(Thread.currentThread().getName());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}


public class FutureTaskExample {

    public static void main (String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        MyRunnable myRunnable1=new MyRunnable(1000);
        MyRunnable myRunnable2=new MyRunnable(2000);
        FutureTask<String> futureTask1=new FutureTask<>(myRunnable1,"Futuretask1 is complete");
        FutureTask<String> futureTask2=new FutureTask<>(myRunnable2,"FutureTask2 is complete");

        ExecutorService executorService= Executors.newFixedThreadPool(2);
        executorService.submit(futureTask1);
        executorService.submit(futureTask2);

        while(true) {

            try {
                if (futureTask1.isDone() && futureTask2.isDone()) {
                    System.out.println("Both tasks are complete");
                    executorService.shutdown();
                }
                if (!futureTask1.isDone()) {
                    System.out.println("Future Task 1 output= " + futureTask1.get());
                }
                String op2 = futureTask2.get(250, TimeUnit.MILLISECONDS);
                if (op2 != null)
                    System.out.println("FutureTask 2 output= " + op2);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
