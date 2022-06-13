package arraysDemos;

public class BubbleSort {

    public static void main(String[] args) {

        int[] a = {45, 12, 85, 32, 89, 39};
        int temp;

        for (int i=0;i<a.length;i++)
        {
            for (int j=i ;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                     temp = a[i];
                     a[i] = a[j];
                     a[j] = temp;
                }

            }
        }

        for (int i=0;i<a.length;i++) {
            System.out.println(a[i]);
        }

        }
}
