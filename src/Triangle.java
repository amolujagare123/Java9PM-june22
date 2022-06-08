import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {

        int a ;
        int b ;
        int c ;


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a -> ");
        a = sc.nextInt();
        System.out.println("Enter b -> ");
        b = sc.nextInt();
        System.out.println("Enter c -> ");
        c = sc.nextInt();

        if(a+b+c==180 && a>0 && b>0 && c>0) {

            if (a == b && b == c)
                System.out.println("Equilateral Triangle");

            if (a != b && b != c && c != a)
                System.out.println("Scalene Triangle");

            if (a == 90 || b == 90 || c == 90)
                System.out.println("Right angled Triangle");

            if ((a == b && b != c) || (b == c && c != a) || (c == a && a != b))
                System.out.println("isosceles Triangle");

        }
        else
            System.out.println("this is not a triangle");

    }
}
