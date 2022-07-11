package CollectionDemos.VectorDemo;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo1 {

    public static void main(String[] args) {

        Vector<String> v = new Vector<>();
        v.add("dhanya");
        v.add("jivansing");
        v.add("jyoti");
        v.add("leela");
        v.add("momin");
        v.add("nitin");
        v.add("pradeep");
        v.add("preeti");
        v.add("purushottam");
        System.out.println(v);

        System.out.println("======= Using Iterator =======");
        Iterator itr = v.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());

        System.out.println("======= Using Enumeration =======");

        Enumeration e = v.elements();
        while (e.hasMoreElements())
            System.out.println(e.nextElement());
    }
}
