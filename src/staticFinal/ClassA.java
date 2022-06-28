package staticFinal;

public final class ClassA {

   /* final*/ void myMethod()
    {
        System.out.println("inside ClassA Method");
    }

}

class ClassB //extends ClassA
{
    void myMethod() // overridden method
    {
        System.out.println("inside ClassB Method");
    }

}
