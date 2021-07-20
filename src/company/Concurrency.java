package company;

public class Concurrency extends Thread{

    public static int amo=0;
    public static void main(String[]args){
        Concurrency thread=new Concurrency();
        thread.start();
        amo++;
        System.out.println(amo);

    }
    public void run(){

        for(int i=0;i<10;i++) {
            System.out.println(amo);
            amo++;
        }

    }
}
