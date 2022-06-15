package StringDemos;

public class StringSplitDemo4 {

    public static void main(String[] args) {

        String str = "Onkar want to go to toronto";
        String[] sAr =   str.split(" ");

         // print only the words has 'o' at index 1 position

         for (int i=0;i< sAr.length;i++) {

             String temp = sAr[i];

               if (temp.charAt(1) == 'o' )
                   System.out.println(sAr[i]);
         }
    }
}
