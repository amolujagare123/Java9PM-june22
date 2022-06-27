package Methods;

public class ReturningValue {

    int getMyIntValue()
    {
       // System.out.println("I am inside the method -getMyIntValue");
      //  System.out.println("below is the value");

        int a = 90;

        return a;
    }

    double getMyDoubleValue()
    {
       double d = 90.34;

       return d;
    }

    char getMyCharValue()
    {
        char c = 'h';

        return c;
    }

    boolean getStatus()
    {
        boolean result = 10<5 ;

        return result;
    }

    public static void main(String[] args) {

       /* int x ;

        x = 10 ;

        System.out.println(x);

        int y = x ;*/

        ReturningValue ob = new ReturningValue();

        System.out.println(ob.getMyIntValue());

        int y = ob.getMyIntValue();

        System.out.println("y="+y);

        System.out.println("Printing double value="+ob.getMyDoubleValue());
        System.out.println("Printing char value="+ob.getMyCharValue());


        if(ob.getStatus())
            System.out.println("Status is true");
        else
            System.out.println("Status is false");



    }
}
