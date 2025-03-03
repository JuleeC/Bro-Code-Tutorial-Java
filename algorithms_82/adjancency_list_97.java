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

        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(2,4);
        graph.addEdge(4,0);
        graph.addEdge(4,2);
        graph.print();

    }
}

class Graph_ {
    ArrayList<LinkedList<Node>> alist;

    Graph_() {
        alist = new ArrayList<>();
    }

    public void addNode(Node node) {
        LinkedList<Node> currentList = new LinkedList<>();
        currentList.add(node);
        alist.add(currentList);
    }
    public void addEdge(int src, int dst ){
        LinkedList<Node> currentList = alist.get(src);
        Node dstNode = alist.get(dst).get(0);
        currentList.add(dstNode);

    }
    public boolean checkEdge(int src, int dst) {
        LinkedList<Node> currentList = alist.get(src);
        Node dstNode = alist.get(dst).get(0);

        for(Node node : currentList) {
            if(node == dstNode) {
                return true;

            }
        }
        return false;
    }

    public void print() {
        for()
    }

}
class Node_ {
    char data;

    Node_(char data) {
        this.data = data;
    }

}
