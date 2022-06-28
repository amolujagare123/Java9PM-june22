package staticFinal;

public class StaticMethodDemo {

    public int rno;
    public String name;
    public static String college="ITC";

    public void display() // non static method
    {
        System.out.println("rno="+rno); // allowed
        System.out.println("name="+name); // allowed
        System.out.println("college="+college); // allowed
        staticMethod1(); // allowed
        staticMethod2(); // allowed
        nonStaticMethod();// allowed
    }

    public void nonStaticMethod()
    {
        System.out.println("nonStaticMethod");
    }
    public static void staticMethod1() // only static members are allowed
    {
        System.out.println("staticMethod1");
        System.out.println("college="+college); // allowed
      //  System.out.println("name="+name); // not allowed
      //  nonStaticMethod(); // not allowed
        staticMethod2(); // allowed
    }

    public static void staticMethod2()
    {
        System.out.println("staticMethod2");
    }


    public static void main(String[] args) {

        StaticMethodDemo ob = new StaticMethodDemo();
        ob.nonStaticMethod();
        ob.staticMethod1();
        ob.staticMethod2();


        StaticMethodDemo.staticMethod1();
        StaticMethodDemo.staticMethod2();
    }

}
