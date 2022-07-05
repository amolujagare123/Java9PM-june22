package WrapperClass;

public class WrapperClassDemo1 {

    public static void main(String[] args) {
        int a =10;

        Integer ii = new Integer(a); // boxing / wrapping

        System.out.println("ii="+ii);

        Integer ii1 = 5; // auto boxing / auto wrapping
        System.out.println("ii1="+ii1);

    }
}
