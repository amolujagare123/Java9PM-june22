package ExceptionHandling;

public class ArrayDemo {
    public static void main(String[] args) {

        int[] a = new int[5];

        try {
            a[0] = 11;
            a[1] = 21;
            a[2] = 14;
            a[3] = 16;
            a[4] = 61;
            a[5] = 61;
        } catch (Exception e)
        {
            System.out.println("inside the catch block");
        }

        for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}
