package CollectionDemos.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListRemoveAll {

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

        al2.add("dhanya");
        al2.add("jivansing");
        al2.add("jyoti");
        al2.add("leela");
        al2.add("xyz1");
        al2.add("xyz2");
        al2.add("xyz3");
        al2.add("xyz4");

        System.out.println("al2="+al2);

        al2.removeAll(al);
        System.out.println("al2="+al2);

        al2.clear();
        System.out.println("al2="+al2);


    }
}
