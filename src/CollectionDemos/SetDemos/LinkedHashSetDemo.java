package CollectionDemos.SetDemos;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

    public static void main(String[] args) {

        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        lhs.add("dhanya");
        lhs.add("jivansing");
        lhs.add("jyoti");
        lhs.add("leela");
        lhs.add("momin");
        lhs.add("nitin");
        lhs.add("pradeep");
        lhs.add("preeti");
        System.out.println(lhs.add("preeti"));
        lhs.add("purushottam");

        System.out.println(lhs);
    }
}
