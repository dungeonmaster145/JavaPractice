package company;

public class Cloning implements Cloneable {

   int rollno;
   String teleno;
   Cloning(int rollno,String teleno){
       this.rollno=rollno;
       this.teleno=teleno;
   }

   public Object clone()throws CloneNotSupportedException{

       return super.clone();
   }

   public static void main(String[]args)
   {

       try {

           Cloning c=new Cloning(1502710083,"6387779531");
           Cloning c1=(Cloning) c.clone();
           System.out.println(c.rollno+" "+c.teleno);
           System.out.println(c1.rollno+" "+c1.teleno);
       }
       catch(Exception e){
           System.out.println(e);
       }

   }

}
