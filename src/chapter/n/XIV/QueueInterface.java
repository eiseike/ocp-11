package chapter.n.XIV;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueInterface {

    public static void main(String[] args) {
        Queue<String> q = new ArrayDeque<>();
        //q.add(1); // DNC: incompatible types: int cannot be converted to java.lang.String
        //q.add(null); // throws NullPointerException

        boolean first = q.add("First");     //         q=[First]
        boolean second = q.offer("Second"); //         q=[First, Second]

        String element = q.element();       // First  (q=[First, Second])
        String peek = q.peek();             // First  (q=[First, Second])

        String remove = q.remove();         // First  (q=[Second])
        String poll = q.poll();             // Second (q=[])

        //q.element(); // throws NoSuchElementException
        String peek1 = q.peek();            // null  (q=[])

        //q.remove(); // throws NoSuchElementException
        String poll1 = q.poll();            // null  (q=[])



    }
}
