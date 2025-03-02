package algorithms_82;

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
        matrix[src][dst] = 1;
    }
    public boolean checkEdge(int src, int dst ) {
        if(matrix[src][dst] == 1) return true; else return false;
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