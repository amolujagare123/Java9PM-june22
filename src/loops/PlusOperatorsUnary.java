package loops;

public class PlusOperatorsUnary {

    public static void main(String[] args) {

        int i = 10 ;

        System.out.println(i); // 10
        System.out.println(i++); // 10
        System.out.println(i);// 11
        System.out.println(++i); // 12
        System.out.println(i); // 12

        /*i++ / i- -  : First the statements are executed
        then increment or decrement happens

        ++i / - - i : First  increment or decrement happens
         then statements are executed then
*/
    }
}
