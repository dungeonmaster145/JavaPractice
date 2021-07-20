package company;

public class Threading extends Thread{

    public void run(){
        System.out.println("this thread is running");
    }
    public static void main(String[]args){

        Threading thread=new Threading();
        thread.start();
        System.out.println("This part is outside of thread");
        char code[]={'0','1','2'};


    }
}
