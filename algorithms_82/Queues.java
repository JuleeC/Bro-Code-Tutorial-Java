package algorithms_82;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
//    Queue = FIFO data structure, First-IN First-OUT ( ex. A line of people)
//            A collection designed for holding elements prior to processing
//            Linear data structure
//
//            add = enqueue, offer()
//            remove = dequeue, poll()
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<String>();

        queue.offer("karen");
        queue.offer("chad");
        queue.offer("steve");
        queue.offer("harold");

        System.out.println(queue);
    }
}
