package Abstaction;

public interface InterfaceDemo {

    void run();
    void start();

    default void display()
    {
        System.out.println("display");
    }

    static void display1()
    {
        System.out.println("display1");
    }

    private void display2()
    {
        System.out.println("display2");
    }
}

class ChildInterface implements  InterfaceDemo
{
   public void start() {
        System.out.println("start");
    }

    public void run() {
        System.out.println("start");
    }
}

class TestInterface
{
    public static void main(String[] args) {

        InterfaceDemo ob = new ChildInterface();

        ob.run();
        ob.start();
        ob.display();
        //ob.display2();
        InterfaceDemo.display1(); // static
    }
}
