package com.GarbageCollector;

class Employee{
    private int ID;
    private String name;
    private int age;
    private static int nextId=1;

    public Employee(String name,int age)
    {
        this.name = name;
        this.age = age;
        this.ID = nextId++;
    }
    public void show()
    {
        System.out.println
                ("Id="+ID+"\nName="+name+"\nAge="+age);
    }
    public void showNextId()
    {
        System.out.println
                ("Next employee id will be="+nextId);
    }

    @Override
    protected void finalize () throws Throwable {
        --nextId;
    }
}

public class UseEmployee {

    public static void main (String[] args) {
        Employee E=new Employee("GFG1",56);
        Employee F=new Employee("GFG2",45);
        Employee G=new Employee("GFG3",25);

        E.show();
        F.show();
        G.show();

        E.showNextId();
        F.showNextId();
        G.showNextId();

        { //It is sub block to keep
            // all those interns.
            Employee X=new Employee("GFG4",58);
            Employee Y=new Employee("GFG5",60);
            Employee Z=new Employee("GFG6",62);

            X.show();
            Y.show();
            Z.show();

            X.showNextId();
            Y.showNextId();
            Z.showNextId();

            X=Y=Z=null;
            System.gc();
            System.runFinalization();
        }
        E.showNextId();
    }
}
