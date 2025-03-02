package algorithms_82;

import java.sql.Array;
import java.util.ArrayList;

public class adjacency_matrix_96 {
    //a 2d array to store 1´s/O´s to represent edges
    //# of rows = # of unique nodes
    //# of columns = # of unique nodes

    //runtime complexity to check an EDGE: O(1)
    //space complexity: O(v*v)

    public static void main(String[] args) {
        Graph graph = new Graph(5);
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

class Graph {
    ArrayList<Node> nodes;
    int[][] matrix;

    Graph(int size) {
        nodes = new ArrayList<>();
        matrix = new int[size][size];
    }

    public void addNode(Node node) {
        nodes.add(node);
    }
    public void addEdge(int src, int dst) {
        matrix[src][dst] = 1;
    }
    public boolean checkEdge(int src, int dst ) {
        if(matrix[src][dst] == 1) return true; else return false;
    }
    public void print() {

        for(Node node : nodes) System.out.print((char) node.data + " ");

        System.out.println();

        for(int i = 0; i< matrix.length; i++) {
            for(int j = 0; j< matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }
    }

}
class Node {
    int data;
    Node(char data) {
        this.data = data;
    }
}