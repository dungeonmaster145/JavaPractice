package company;

public class SBuilder {

    public static void main(String[]args){

        String s="My name is Mayank Joshi";
       final StringBuilder sb=new StringBuilder(s);
        sb.append(524563135);
        String N=sb.toString();

        System.out.print(N);
    }
}
