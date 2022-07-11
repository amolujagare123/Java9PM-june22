package CollectionDemos.VectorDemo;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo2 {

    public static void main(String[] args) {

        Vector<String> v = new Vector<>();
        System.out.println("size="+v.size()); // 0
        System.out.println("Capacity="+v.capacity()); // 10

        v.add("dhanya");
        v.add("jivansing");
        v.add("jyoti");
        v.add("leela");
        v.add("momin");
        v.add("nitin");
        v.add("pradeep");
        v.add("preeti");
        v.add("purushottam");
        v.add("purushottam");
        v.add("purushottam");
        v.add("dhanya");
        v.add("jivansing");
        v.add("jyoti");
        v.add("leela");
        v.add("momin");
        v.add("nitin");
        v.add("pradeep");
        v.add("preeti");
        v.add("purushottam");
        v.add("preeti");

        System.out.println("size="+v.size()); // 21
        System.out.println("Capacity="+v.capacity()); //40

        System.out.println(v);

    }
}
