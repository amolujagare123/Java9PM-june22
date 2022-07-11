package CollectionDemos.StackDemo;

import java.util.Stack;

public class StackDemo1 {

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        System.out.println(s.empty()); // true

        s.push(79);
        s.push(19);
        s.push(61);
        s.push(29);
        s.push(48);
        s.push(59);
        s.push(75);
        System.out.println(s.empty()); // false

        System.out.println(s);
        System.out.println(s.pop());

        System.out.println(s);

        System.out.println(s.pop());

        System.out.println(s);

        System.out.println(s.peek());
        System.out.println(s);

    }
}
