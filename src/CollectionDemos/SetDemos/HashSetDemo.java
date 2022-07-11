package CollectionDemos.SetDemos;

import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<>();

        hs.add("dhanya");
        hs.add("jivansing");
        hs.add("jyoti");
        hs.add("leela");
        hs.add("momin");
        hs.add("nitin");
        hs.add("pradeep");
        hs.add("preeti");
        System.out.println(hs.add("preeti"));
        hs.add("purushottam");

        System.out.println(hs);
    }
}
