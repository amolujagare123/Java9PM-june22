package CollectionDemos.SetDemos;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        //TreeSet<String> ts = new TreeSet<>();
        TreeSet ts = new TreeSet();

        ts.add("dhanya");
        ts.add("jivansing");
        ts.add("jyoti");
        ts.add("leela");
        ts.add("momin");
        ts.add("nitin");
        ts.add("pradeep");
        ts.add("preeti");
        System.out.println(ts.add("preeti"));
        ts.add("purushottam");
      //  ts.add(12);

        System.out.println(ts);
    }
}
