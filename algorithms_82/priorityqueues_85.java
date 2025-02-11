package algorithms_82;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class priorityqueues_85 {
    //Priority Queue = a FIFO data strucutre that serves elements
    //                 with the highest priorities first
    //                 before elements with lower priority.



    public static void main(String[] args) {
        Queue<String> queuee = new PriorityQueue<>(Collections.reverseOrder());

        queuee.offer("A");
        queuee.offer("B");
        queuee.offer("C");
        queuee.offer("D");
        queuee.offer("E");

        while(!queuee.isEmpty()) {
            System.out.println(queuee.poll());
        }
    }

}
