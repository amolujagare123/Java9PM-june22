package loops;

public class MinusOperatorsUnary {

    public static void main(String[] args) {

        int i = 10 ;

        System.out.println(i); // 10
        System.out.println(i--); // 10
        System.out.println(i);// 9
        System.out.println(--i); // 8
        System.out.println(i); // 8

        /*i++ / i- -  : First the statements are executed
        then increment or decrement happens
        ++i / - - i : First  increment or decrement happens
         then statements are executed then
*/
    }
}
