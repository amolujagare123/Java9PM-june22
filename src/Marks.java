import java.util.Scanner;

public class Marks {

    public static void main(String[] args) {

        int marks;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks");
        marks = sc.nextInt();

        if(marks>=1 && marks<=100) {
            if (marks < 40)
                System.out.println("Fail");

            else if (marks >= 40 && marks < 50)
                System.out.println("Pass");

            else if (marks >= 50 && marks < 60)
                System.out.println("Second class");

            else if (marks >= 60 && marks < 70)
                System.out.println("First class");

            else //if(marks>=70)
                System.out.println("Distinction");
        }
        else
            System.out.println("please put the correct number");




    }
}
