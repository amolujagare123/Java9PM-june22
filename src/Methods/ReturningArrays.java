package Methods;

public class ReturningArrays {



    int[] getMyArray()
    {
        int[] x = {21,32,54,67,89,11,23,45,6};

        return x;
    }

    String[][] getTwoDArray()
    {
        String[][] sArr= {
                {"abc1","pqr1","xyz1"},
                {"abc2","pqr2","xyz2"},
                {"abc3","pqr3","xyz3"},
                {"abc4","pqr4","xyz4"},
                {"abc5","pqr5","xyz5"}
    };
        return sArr;
    }

    public static void main(String[] args) {


        ReturningArrays ob = new ReturningArrays();


       int[] arr =  ob.getMyArray();

       for (int i=0;i<arr.length;i++)
           System.out.println(arr[i]);

       String[][] myTwoDArray = ob.getTwoDArray();

       for (int i=0;i<myTwoDArray.length;i++) {
           for (int j = 0; j < myTwoDArray[0].length; j++)
           {
               System.out.print(myTwoDArray[i][j]+" ");
           }
           System.out.println();
       }
    }
}
