package arraysDemos.TwoDArray;

public class TwoDArray3 {

    public static void main(String[] args) {

        String[][] s = {
                {"dhanya","john","jyoti","leela","minal"},
                {"nilesh","onkar","parthiban","pradeep","prasann"},
                {"pratikshya","preeti","renuka","sangita","shalini"},
        };
        // 3 x 5

        for(int i=0;i<s.length;i++)
        {
            for (int j=0;j<s[0].length;j++)
            {
                System.out.print(s[i][j]+"\t\t");
            }
          System.out.println();
        }
    }
}
