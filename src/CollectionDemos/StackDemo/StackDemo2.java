package CollectionDemos.StackDemo;

import java.util.Stack;

public class StackDemo2 {

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        s.push(79); //0
        s.push(19); //1
        s.push(61); //2
        s.push(29);
        s.push(48);
        s.push(59);
        s.push(75);

        System.out.println(s);

        System.out.println(s.search(48));


    }
}
