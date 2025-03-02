package algorithms_82;

public class adjacency_matrix_96 {
    //a 2d array to store 1´s/O´s to represent edges
    //# of rows = # of unique nodes
    //# of columns = # of unique nodes

    //runtime complexity to check an EDGE: O(1)
    //space complexity: O(v*v)

    public static void main(String[] args) {



    }
}

class Graph {
    int[][] matrix;

    Graph(int size) {
        matrix = new int[size][size];
    }

    public void addNode(Node node) {

    }
    public void addEdge(int src, int dst) {

    }
    public boolean checkEdge(int src, int dst ) {

    }
    public void print() {

    }

}
class Node {
    int data;
    Node(char data) {
        this.data = data;
    }
}