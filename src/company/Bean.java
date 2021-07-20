package company;

public class Bean {

   private int id;
   private String name,address;
   private double salary;

   public void setName(String name){
      this.name=name;
   }

   public String getName(){

      return name;
       //System.out.println("The name is + "+name);
   }

   public String getAddress() {
      return address;
   }

   public void setAddress(String address) {
      this.address = address;
   }

   public double getSalary() {
      return salary;
   }

   public void setSalary(double salary) {
      this.salary = salary;
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }
   public void display()
   {
      System.out.println("id is "+this.getId()+" name is "+
              this.getName()+
              " address is " +this.getAddress()+
              " salary is "+this.getSalary());
   }
}
