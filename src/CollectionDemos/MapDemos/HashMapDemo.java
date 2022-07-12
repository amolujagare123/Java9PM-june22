package CollectionDemos.MapDemos;

import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap hs = new HashMap();

        hs.put(101,"amol");
        hs.put(201,"rahul");
        hs.put(301,"rohit");
        hs.put(401,"vaibhav");
        hs.put(401,"pranav");
        hs.put(10.1,"pranav");
        hs.put(true,12);
        hs.put("am",89.6);
        hs.put("aa",null);
        hs.put(null,null);
        hs.put(null,"abcd");

        System.out.println(hs);


    }

}
