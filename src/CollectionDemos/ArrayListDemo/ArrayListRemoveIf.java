package CollectionDemos.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListRemoveIf {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("dhanya");
        al.add("jivansing");
        al.add("jyoti");
        al.add("leela");
        al.add("momin");
        al.add("nitin");
        al.add("pradeep");
        al.add("preeti");
        al.add("purushottam");

        System.out.println(al);
        // - remove all the elements from the list that starts with p
        // str -> str.charAt(0) == 'p' | str.startsWith("p");
        // -> predicate symbol
        al.removeIf(str -> str.charAt(0) == 'p');

        System.out.println(al);





    }
}
