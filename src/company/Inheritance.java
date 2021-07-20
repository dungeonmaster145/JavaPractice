package company;

public class Inheritance {

    public void caller(){
        System.out.println("This is the parent class object");
    }
    public static void main(String[]args){
        Inheritance obj=new Inheritance();
        obj.caller();
    }
}

class child extends Inheritance{

    public void caller(){

        System.out.println("I am in my child class");
    }
    public static void main(String[]args){

        Inheritance obj=new child();
        obj.caller();
    }
}
