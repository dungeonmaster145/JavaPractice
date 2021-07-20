package com;

public class ThreadJoin extends Thread{

    @Override
    public void run () {


        for (int i = 0; i < 2; i++)
        {
            try
            {
                Thread.sleep(500);
                System.out.println("Current Thread: "
                        + Thread.currentThread().getName());
            }

            catch(Exception ex)
            {
                System.out.println("Exception has" +
                        " been caught" + ex);
            }
            System.out.println(i);
        }


        }



    public static void main (String[] args) {
        ThreadJoin t1=new ThreadJoin();
        ThreadJoin t2=new ThreadJoin();
        ThreadJoin t3=new ThreadJoin();

       t1.start();
       try{
           System.out.println(Thread.currentThread().getName());
           t1.join();
       }
       catch(Exception e)
        {
            e.printStackTrace();
        }
       t2.start();

       try{
           System.out.println(Thread.currentThread().getName());
           t2.join();
       }
       catch(Exception e)
       {
           e.printStackTrace();
       }
       t2.start();
    }
}
