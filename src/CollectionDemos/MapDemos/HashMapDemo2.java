package CollectionDemos.MapDemos;

import java.util.HashMap;

public class HashMapDemo2 {

    public static void main(String[] args) {

        HashMap<Integer,String> hs = new HashMap<>();

        hs.put(101,"amol");
        hs.put(201,"rahul");
        hs.put(301,"rohit");
        System.out.println(hs.put(401,"vaibhav")); // null
        System.out.println(hs.put(401,"pranav")); // vaibhav


        System.out.println("hs="+hs);

        HashMap<Integer,String> hs2 = new HashMap<>();

        System.out.println("hs2="+hs2);

        hs2.putAll(hs);
        System.out.println("hs2="+hs2);


    }

}
