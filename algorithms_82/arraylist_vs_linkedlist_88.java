package algorithms_82;

import java.util.ArrayList;
import java.util.LinkedList;

public class arraylist_vs_linkedlist_88 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        long startTime;
        long endTime;
        long elapsedTime;


        for(int i =0;i < 1000000; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }

        startTime = System.nanoTime();

        //do something

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;
        System.out.println()
    }
}
