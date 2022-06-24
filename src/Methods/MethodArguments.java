package Methods;

public class MethodArguments {

    void printStatements()
    {
        System.out.println("Text1");
        System.out.println("Text2");
        System.out.println("Text3");
        System.out.println("Text4");
    }

    void printValueOfA(int a)
    {
        System.out.println("a="+a);

    }

    void printGivenValues(int a, int b)
    {
        System.out.println("a="+a);
        System.out.println("b="+b);
    }

    void printValues(int a, double b,String s)
    {
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("s="+s);
    }

    public static void main(String[] args) {

        MethodArguments ob = new MethodArguments();
        ob.printStatements();

        ob.printGivenValues(10,20);

        ob.printValues(12,98.8,"amol");

    }
}
