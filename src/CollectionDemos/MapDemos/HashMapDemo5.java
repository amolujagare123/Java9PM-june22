package CollectionDemos.MapDemos;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo5 {

    public static void main(String[] args) {

        HashMap<Integer,String> hashMap = new HashMap<>();

        hashMap.put(101,"amol");
        hashMap.put(201,"rahul");
        hashMap.put(301,"rohit");
        hashMap.put(401,"vaibhav");
        hashMap.put(402,"vaibhav");


        System.out.println("hashMap="+hashMap);

        Set keySet = hashMap.keySet();
        System.out.println("Keyset = "+keySet);

        Collection values = hashMap.values();
        System.out.println("values="+values);

        Set entrySet = hashMap.entrySet();

        System.out.println("entrySet = "+entrySet);


    }

}
