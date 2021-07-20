package company;
//this defines the relationship for the instance variable for the parent class.
 class Parent {

    String name="Mayank";

}
public class Super extends Parent
{
    String name;
    Super(String name){
        this.name=name;
    }
    void display(){
        System.out.println("The child class name is  "+name);
        System.out.println("The parent child name is "+super.name);
    }
    public static void main(String[]args){

        Super obj=new Super("Akshit");
        obj.display();
    }
}