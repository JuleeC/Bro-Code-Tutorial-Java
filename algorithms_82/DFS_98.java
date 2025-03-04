package algorithms_82;

import java.util.ArrayList;

public class DFS_98 {
    // a search algorithm for traversing
    // a tree or graph data structure

    // 1. pick a route
    // 2. Keep going until you reach a dead end, or a previously visited node
    // 3. Backtrack to last node that has unvisited adjacent neighbors

    public static void main(String[] args) {
        Graph__ graph = new Graph__(5);
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
class Graph__ {
    ArrayList<Node> nodes;
    int[][] matrix;

    Graph__(int size)  {

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
        System.out.print("  ");
        for(Node node : nodes) System.out.print( node.data + " ");

        System.out.println();

        for(int i = 0; i< matrix.length; i++) {
            System.out.print(nodes.get(i).data + " ");
            for(int j = 0; j< matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }
    }

    public void depthFirstSearch(int src) {
        boolean[] visited = new boolean[matrix.length];
        dFSHelper(src,visited);
    }
    private void dFSHelper(int src, boolean[] visited) {
        if(visited[src] == true)
        {
            return;
        }else {
            visited[src] = true;
            System.out.println(nodes.get(src).data + " = visited");
        }
    }
}
class Node__ {
    char data;


    Node__(char data) {
        this.data = data;
    }
}