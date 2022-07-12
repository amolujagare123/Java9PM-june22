package CollectionDemos.MapDemos;

import java.util.HashMap;

public class HashMapDemo4 {

    public static void main(String[] args) {

        HashMap<Integer,String> hashMap = new HashMap<>();

        System.out.println(hashMap.isEmpty());//true

        hashMap.put(101,"amol");
        hashMap.put(201,"rahul");
        hashMap.put(301,"rohit");
        System.out.println(hashMap.put(401,"vaibhav")); // null

        System.out.println(hashMap.isEmpty());//false

        System.out.println("hashMap="+hashMap);

        System.out.println(hashMap.containsKey(301));
        System.out.println(hashMap.containsValue("rohit"));

        System.out.println("size = "+hashMap.size());

        hashMap.clear();
        System.out.println("hashMap="+hashMap);




    }

}
