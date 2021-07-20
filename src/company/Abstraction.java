package company;

abstract class Abstraction {
    abstract public void run();

    public void caller(){
        System.out.println("I am going to call you here");
    }
}

class helper extends Abstraction{

   public void run(){
       System.out.println("Today is a good day");
   }
   public void caller()
   {
       System.out.println("This is not going to go down well with you");
   }
    public static void main(String[]args){

        Abstraction obj=new helper();
        obj.run();
        obj.caller();

    }
}
