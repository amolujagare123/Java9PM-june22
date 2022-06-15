package StringDemos;

public class StringComparison {

    public static void main(String[] args) {

        String str1 = "amol";
        String str2 = "amol";
        String str3 = "Amol";
        String str4 = "Java";
        String str5 = new String("amol");


        /*int a = 10;
        int b = 10 ;
        System.out.println(a==b);*/

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equals(str4));
        System.out.println(str1.equals(str5));
        System.out.println(str1.equalsIgnoreCase(str3));


        System.out.println(str1==str2); // true
        System.out.println(str1==str5);

        str1 = "amol1";

        System.out.println(str1==str2);
    }
}
