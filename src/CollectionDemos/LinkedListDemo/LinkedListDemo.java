package CollectionDemos.LinkedListDemo;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {


        LinkedList<String> ll = new LinkedList<>();

        ll.add("dhanya");
        ll.add("jivansing");
        ll.add("jyoti");
        ll.add("leela");
        ll.add("momin");
        ll.add("nitin");
        ll.add("pradeep");
        ll.add("preeti");
        ll.add("purushottam");

        System.out.println(ll);

        ll.addFirst("first");
        ll.addLast("last");

        System.out.println(ll);

        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);

    }
}
