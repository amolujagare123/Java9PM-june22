package arraysDemos;

public class ArrayDemo2 {

    public static void main(String[] args) {

        int[] a = new int[5];

        a[0] = 11;
        a[1] = 21;
        a[2] = 13;
        a[3] = 41;
        a[4] = 17;

       /* for (int i=0;i<5;i++)
        {
            System.out.println(a[i]);
        }*/

        for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }


    }
}
