package algorithms_82;

import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class adjancency_list_97 {
    // an array/arraylist of linkedlists.
    // each LinkedList has a unique node at the head.
    // all adjacent neighbors to that node are added to that nodes linkedlist

    // runtime complexity to check an Edge: O(v)
    // space complexity: O(v + e)

    public static void main(String[] args) {
        Graph_ graph = new Graph_();

    }
}

class Graph_ {
    ArrayList<LinkedList<Node>> alist;

    Graph_() {
        alist = new ArrayList<>();
    }

    public void addNode(Node node) {

    }
    public void addEdge(int src, int dst ){

    }
    public void checkEdge(int src, int dst) {

    }
    public void print() {

    }

}
class Node_ {
    char data;

    Node_(char data) {
        this.data = data;
    }

}
