package CollectionDemos.ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {

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
        System.out.println(al.get(3));
        System.out.println(al.size());

        System.out.println("using for loop");
        for (int i=0;i<al.size();i++)
        {
            System.out.println(al.get(i));
        }

        System.out.println("using for each loop");

        for (String str:al)
            System.out.println(str);

        System.out.println("using for iterator");

        Iterator itr = al.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());



    }
}
