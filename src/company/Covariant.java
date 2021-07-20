package company;
class Covariant1 {

    Covariant1 get(){
        return this;
    }

}

public class Covariant extends Covariant1{

    Covariant get(){
        return this;
    }
    void Message(){
        System.out.println("Welcome to my world");
    }
    public static void main(String[]args){

        new Covariant().get().Message();

    }
}
