package CollectionDemos.MapDemos;

import java.util.HashMap;

public class HashMapDemo3 {

    public static void main(String[] args) {

        HashMap<Integer,String> hs = new HashMap<>();

        hs.put(101,"amol");
        hs.put(201,"rahul");
        hs.put(301,"rohit");
        System.out.println(hs.put(401,"vaibhav")); // null

        System.out.println("hs="+hs);

        System.out.println(hs.get(201));

        hs.remove(201);
        System.out.println("hs="+hs);

    }

}
