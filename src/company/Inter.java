package company;

public interface Inter {

    public void calling();
    abstract void call();
}
class Main implements Inter{

    @Override
    public void calling() {
        System.out.println("Going by the rules");
    }

    @Override
    public void call() {

        System.out.println("Not going by the rules");
    }
    public static void main(String[]args){

        Main obj=new Main();
        obj.call();
        obj.calling();
    }
}