package company;

public class Display {

    public static void main(String[]args){

        Bean b=new Bean();
        b.setName("Mayank");
        System.out.println(b.getName());
        ReadOnly r=new ReadOnly();
        System.out.println(r.getName());
    }

}
