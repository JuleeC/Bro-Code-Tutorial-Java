package algorithms_82;

import java.util.LinkedList;
import java.util.Queue;

public class priorityqueues_85 {
    //Priority Queue = a FIFO data strucutre that serves elements
    //                 with the highest priorities first
    //                 before elements with lower priority.



    public static void main(String[] args) {
        Queue<Double> queuee = new LinkedList<>();

        queuee.offer(1.0);
        queuee.offer(2.5);
        queuee.offer(4.5);
        queuee.offer(4.0);
        queuee.offer(3.1);

        while(!queuee.isEmpty()) {
            System.out.println(queuee.poll());
        }
    }

}
