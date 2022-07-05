package CollectionDemos.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo1 {

    public static void main(String[] args) {


        ArrayList al = new ArrayList();
        al.add("ab1");
        al.add("ab2");
        al.add(56);

        al.add(56);


       // al.add(45); // error

        ArrayList<Integer> al2 = new ArrayList<>();

        al2.add(45);

    }
}
