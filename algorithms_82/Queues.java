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

        //if using element there will be an exception
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();


        System.out.println(queue.peek());
        System.out.println(queue);
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        System.out.println(queue.contains("Harold"));

        // Where are queues useful?
        //1. Keyboard buffer (letters should appear on the screen in the order theyre pressed)
        //2. Printer Queue (Print jobs should be completed in order)
        //3. Used in LinkedList, PriorityQueues, Breath first search
    }
}
