package java.algorithms.algorithms_82;

public class binary_search_tree_101 {
//Binary Search Tree = a tree data structure, where each node is greater than its left child, but less than its right.
//                     but less than its right.
//                     benefit : easy to locate a node when they are in this order
    // time complexity: best case O(log n)
    //                  worst case O(n)

    // space complexity: O(n)



    public static void main(String[] args ) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(new Nodee(5));
        tree.insert(new Nodee(3));
        tree.insert(new Nodee(6));
        tree.insert(new Nodee(2));
        tree.insert(new Nodee(8));
        tree.insert(new Nodee(9));
        tree.insert(new Nodee(1));
        tree.insert(new Nodee(4));
        tree.insert(new Nodee(7));

        tree.remove(0);
        tree.remove(4);
        tree.remove(5);
        tree.display();

        System.out.println(tree.search(1));
    }

}

class Nodee {
    int data;
    Nodee left;
    Nodee right;


    public Nodee(int data) {
        this.data = data;
    }
}

class BinarySearchTree {
    Nodee root;

    public void insert(Nodee node) {
        root = insertHelper(root, node);
    }

    private Nodee insertHelper(Nodee root, Nodee node) {
        int data = node.data;

        if (root == null) {
            root = node;
            return root;
        } else if (data < root.data) {
            root.left = insertHelper(root.left, node);
        } else {
            root.right = insertHelper(root.right, node);
        }
        return root;
    }

    public void display() {
        displayHelper(root);
    }

    private void displayHelper(Nodee root) {
        if (root != null) {
            displayHelper(root.left);
            System.out.println(root.data);
            displayHelper(root.right);
        }
    }

    public boolean search(int data) {
        return searchHelper(root, data);
    }

    private boolean searchHelper(Nodee root, int data) {
        if (root == null) {
            return false;
        } else if (root.data == data) {
            return true;
        } else if (root.data > data) {
            return searchHelper(root.left, data);
        } else {
            return searchHelper(root.right, data);
        }
    }

    public void remove(int data) {
        if (search(data)) {
            removeHelper(root, data);
        } else {
            System.out.println(data + " could not be found ");
        }
    }

    public Nodee removeHelper(Nodee root, int data) {
        if (root == null) {
            return root;
        } else if (data < root.data) {
            root.left = removeHelper(root.left, data);
        }
        else if(data > root.data ) {
            root.right = removeHelper(root.right,data);
        }
        else { //node found
            if(root.left == null && root.right == null ){
                root = null;
            }
            else if(root.right != null) {
                root.data =successor(root);
                root.right = removeHelper(root.right, root.data);
            }
            else {
                root.data = predeccessor(root);
                root.left = removeHelper(root.left,root.data);
            }
        }
        return root;
    }


 private int successor(Nodee root) { //find least value below the right child of this root node
     root = root.right;
     while(root.left != null ) {
         root = root.left;

     }
     return root.data;
 }
 private int predeccessor(Nodee root) { //find greatest value below the right child of this root node
     root = root.left;
     while(root.right != null ) {
         root = root.right;

     }
     return root.data;
    }
}