package Abstaction;

public abstract class AbstractClassDemo {

    abstract void start();
    abstract void run();

    void display()
    {
        System.out.println("inside display");
    }
}

class ChildClass extends AbstractClassDemo
{

    void start() {
        System.out.println("start");
    }

    void run() {
        System.out.println("start");
    }
}

class TestAbstraction
{
    public static void main(String[] args) {
     //   AbstractClassDemo ob = new AbstractClassDemo();

        AbstractClassDemo ob = new ChildClass();
        ob.start();
        ob.run();
        ob.display();

    }
}
