package Methods;

public class MethodArguments2 {


    void printMyArray(int[] arr,String msg)
    {
        System.out.println(msg);
        for (int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    }


    void printMyTwoDArray(String[][] sArr)
    {
        for (int i=0;i< sArr.length;i++)
        {
            for (int j=0;j<sArr[0].length;j++)
            {
                System.out.print(sArr[i][j]+" ");
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {

        MethodArguments2 ob = new MethodArguments2();


        int[] a = {23,56,2,1,56,12,57,89,10};

        ob.printMyArray(a,"printing integer array");

        String[][] s = {
                {"abc1","pqr1","xyz1"},
                {"abc2","pqr2","xyz2"},
                {"abc3","pqr3","xyz3"},
                {"abc4","pqr4","xyz4"},
                {"abc5","pqr5","xyz5"}
        };

        ob.printMyTwoDArray(s);


    }



}
