package WrapperClass;

public class Conversions {

    public static void main(String[] args) {

        String s1 = "12";
        String s2 = "44";

        System.out.println(s1+s2);

        int i1 = Integer.parseInt(s1);
        int i2 = Integer.parseInt(s2);

        System.out.println(i1+i2);

        String s3 = "12.44";
        String s4 = "44.12";

        double d1 = Double.parseDouble(s3);
        double d2 = Double.parseDouble(s4);
        System.out.println(d1+d2);

        float f1 = Float.parseFloat(s3);
        float  f2 = Float.parseFloat(s4);
        System.out.println(f1+f2);

        String s5 = "false";

        boolean result = Boolean.parseBoolean(s5);

        if (result)
            System.out.println("result is true");
        else
            System.out.println("result is false");

        String s6 = "r";

       // find how to convert string into char

        char c = s6.charAt(0);

    }
}
