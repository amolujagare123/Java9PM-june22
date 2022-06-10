package loops;

public class FizzBuzzProblem2 {

    public static void main(String[] args) {


        for(int i=1;i<=30;i++)
        {
            System.out.print(i+" ");

            if(i%3==0)
                System.out.print("Fizz");

            if(i%5==0)
                System.out.print("Buzz");

            System.out.println();
        }

    }
}
