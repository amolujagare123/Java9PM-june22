package StringDemos;

public class StringSplitDemo3 {

    public static void main(String[] args) {

        String str = "Hey baby you are so lovely";
        String[] sAr =   str.split(" ");

         // print only the words that ends with 'y'

         for (int i=0;i< sAr.length;i++) {

             String temp = sAr[i];
             int l = temp.length();

             if ( temp.charAt(l-1) == 'y')
                   System.out.println(sAr[i]);
         }
    }
}
