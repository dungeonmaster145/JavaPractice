package company;

class Base {
    public void show() {
        System.out.println("Base class show() method");
    }
    public final void test() {
        System.out.println("Base class test() method");
    }
}
class Derived extends Base {
    public void show() {
        System.out.println("Derived class show() method");
    }
    // can not override test() method because its final in Base class

      // public void test() { System.out.println("Derived class test() method"); }

}
public class Test {
    public static void main(String[] args) {
        Base ref = new Derived();
        // Calling the final method test()
        ref.test();
        // Calling the overridden method show()
        ref.show();
    }
}