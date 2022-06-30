package Abstaction;

public interface Interface2 {

    void run();
    void start();
    void display();
}

interface AnotherInterface
{
    void display();
}

class ChildInterface2 implements Interface2,AnotherInterface
{

    @Override
    public void run() {
        System.out.println("run");
    }

    @Override
    public void start() {
        System.out.println("start");
    }

    @Override
    public void display() {
        System.out.println("display");
    }
}

class TestInterface2
{
    public static void main(String[] args) {

        Interface2 ob = new ChildInterface2();
        ob.display();
    }
}
