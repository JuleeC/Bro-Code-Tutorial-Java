package algorithms_82;

import java.nio.file.NotDirectoryException;
import java.util.LinkedList;

public class linkedlists_86 {

//    LinkedList = stores Nodes in 2 parts(data + address)
//                 Nodes are in non-consecutive memory locations
//                 Elements are linked using pointer
//
//
//    Singly Linked List:
//    Node                    Node                Node
//    [data | address] -> [data | address] -> [data | address]
//

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
