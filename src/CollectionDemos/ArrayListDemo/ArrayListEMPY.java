package CollectionDemos.ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEMPY {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        System.out.println(al.isEmpty()); //true

        al.add("dhanya");
        al.add("jivansing");
        al.add("jyoti");
        al.add("leela");
        al.add("momin");
        al.add("nitin");
        al.add("pradeep");
        al.add("preeti");
        al.add("purushottam");
        System.out.println(al.isEmpty()); // false

        System.out.println(al);


        al.set(6,"xyz");

        System.out.println(al);



    }
}
