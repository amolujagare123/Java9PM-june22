package StringDemos;

public class StringSplitDemo1 {


    public static void main(String[] args) {

        String str = "Hi This is Java class";

         String[] sAr =   str.split(" ");

         for (int i=0;i< sAr.length;i++)
             System.out.println(sAr[i]);



    }
}
