package algorithms_82;

import java.util.LinkedList;

public class linkedlists_86 {

    public static void main(String[] args) {

        LinkedList<String> linkedlist = new LinkedList<String>();

        //offer is also working
        linkedlist.push("A");
        linkedlist.push("B");
        linkedlist.push("C");
        linkedlist.push("D");
        linkedlist.push("F");

        //poll is also working
        //linkedlist.pop();

        linkedlist.add(1,"E");
        linkedlist.remove("E");

        System.out.println(linkedlist.peekFirst());
        System.out.println(linkedlist.peekLast());
        linkedlist.addFirst("G");
        linkedlist.addLast("0");

        String first = linkedlist.removeFirst();
        String last = linkedlist.removeLast();

        System.out.println(first + " " + last);
        System.out.println(linkedlist);
    }
}
