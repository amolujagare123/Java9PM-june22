package CollectionDemos.QueueDemos;

import java.util.ArrayDeque;

public class ArrayDequeueDemo {

    public static void main(String[] args) {

        ArrayDeque<String> adq = new ArrayDeque<>();

        adq.offer("Vivekanand");
        adq.offer("Shalini");
        adq.offer("Renuka");
        adq.offer("Purushottam");
        adq.offer("Preeti");
        adq.offer("Pradeep");
      //  adq.offer(null); // not allowed

        System.out.println(adq);

        adq.offerFirst("First");
        adq.offerLast("Last");

        System.out.println(adq);

        adq.pollFirst();
        adq.pollLast();

        System.out.println(adq);


    }
}
