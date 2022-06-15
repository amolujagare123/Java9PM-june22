package StringDemos;

public class StringSplitDemo2 {


    public static void main(String[] args) {

        String str = "it is his decision";

         String[] sAr =   str.split("is");

         for (int i=0;i< sAr.length;i++)
             System.out.println(sAr[i]);



    }
}
