package StringDemos;

public class StringSplitDemo5 {

    public static void main(String[] args) {

        String str = "Hey baby you are so lovely";
        String[] sAr =   str.split(" ");

         // print only the words that ends with 'y'

         for (int i=0;i< sAr.length;i++) {

             if ( sAr[i].endsWith("y"))
                   System.out.println(sAr[i]);
         }
    }
}
