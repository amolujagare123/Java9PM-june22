package ExceptionHandling;

public class NumberDemo {

    public void checkNumber(int i)
    {
        if(i<=10 && i>=1)
            System.out.println("We are safe");
        else
            throw new ArithmeticException("we are in danger");
    }

    public static void main(String[] args) {

        int a = 11;

        System.out.println("checking numbers");

        NumberDemo ob = new NumberDemo();
        ob.checkNumber(a);

        System.out.println("end of the program");


    }

}
