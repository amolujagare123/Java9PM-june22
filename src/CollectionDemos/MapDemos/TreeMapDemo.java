package CollectionDemos.MapDemos;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {

        TreeMap<Integer,String> tm = new TreeMap<>();

        tm.put(454,"amol");
        tm.put(212,"rahul");
        tm.put(989,"rohit");
        tm.put(265,"vaibhav");
        tm.put(666,"vaibhav");

        System.out.println(tm);

        TreeMap tm1 = new TreeMap();

        tm1.put(454,"amol");
        tm1.put(212,"rahul");
        tm1.put('o',"rohit");
        tm.put(265,"vaibhav");
        tm1.put(66.6,"vaibhav");

        System.out.println(tm1);
    }
}
