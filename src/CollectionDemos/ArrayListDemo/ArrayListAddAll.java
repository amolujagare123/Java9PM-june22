package CollectionDemos.ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListAddAll {

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

        System.out.println("al="+al);

        ArrayList<String> al2 = new ArrayList<>();

        System.out.println("al2="+al2);

        al2.addAll(al);

        System.out.println("al2="+al2);



    }
}
