package CollectionDemos.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListRemove {

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

       // al.remove(5);
        al.remove("pradeep");

        System.out.println("al="+al);




    }
}
