package WrapperClass;

public class WrapperClassDemo2 {

    public static void main(String[] args) {
        int a =10;

        Integer ii = new Integer(a); // boxing / wrapping

        int x = ii.intValue(); // unboxing /unwrapping
        int x1 = ii;// auto unboxing / auto unwrapping

        System.out.println("x="+x);
        System.out.println("x1="+x1);
    }
}
