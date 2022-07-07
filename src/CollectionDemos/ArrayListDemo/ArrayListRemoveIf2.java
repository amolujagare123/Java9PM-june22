package CollectionDemos.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListRemoveIf2 {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();

        al.add(23);
        al.add(13);
        al.add(24);
        al.add(28);
        al.add(33);
        al.add(43);
        al.add(22);
        al.add(20);


        System.out.println(al);
        // - remove all the elements which are odd numbers
        // a -> a%2 != 0
        // -> predicate symbol

        al.removeIf(a -> a%2 != 0);

        System.out.println(al);





    }
}
