package InheritanceDemos.PolymorphismDemo;

public class ClassA {

    public void display()
    {
        System.out.println("display inside class A");
    }

    // while overriding a method you should not decrease the scope
    // of the method
}

class ClassB extends ClassA
{
    //@Override
    public void display() // overridden method
    {
        System.out.println("display inside class B");
    }

    public static void main(String[] args) {

        ClassA ob = new ClassB(); // up casting

        ob.display();

    }

}

