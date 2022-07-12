package CollectionDemos.MapDemos;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHasMapDemo {

    public static void main(String[] args) {

        LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>();

        lhm.put(101,"amol");
        lhm.put(201,"rahul");
        lhm.put(301,"rohit");
        lhm.put(401,"vaibhav");
        lhm.put(402,"vaibhav");

        System.out.println(lhm);
    }
}
