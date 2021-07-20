package company;

public class MethodOverloadingNull
{
    public void run(String runner)
    {
        System.out.println(runner);
    }
    public void run(Integer runner)
    {
        System.out.println(runner);
    }

    public static void main(String[]args){

        String x=null;
        MethodOverloadingNull obj=new MethodOverloadingNull();
        obj.run(x);
    }
}
