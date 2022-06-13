package arraysDemos;

public class ArrayEvenOdd {


        public static void main(String[] args)

        {

            int [] a = {10,22,31,45,50,63,71,80,42,89,100,66,26,72,28,91,30};

            for (int i=0;i<a.length;i++)
            {
                if (a[i]%2==0)
                    System.out.println(a[i]+ "-Even");
                else
                    System.out.println(a[i]+ "-Odd");
            }

        }

}
