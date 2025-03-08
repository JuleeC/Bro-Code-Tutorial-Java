package algorithms_82;

public class binary_search_tree_101 {
    BinarySearchTree tree = new BinarySearchTree();
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
     root = insertHelper(root,node);
 }
 private Nodee insertHelper(Nodee root, Nodee node) {
     int data = node.data;

     if(root == null) {
         root = node;
         return root;
     } else if (data < root.data ) {
         root.left = insertHelper(root.left,node);
     }else {
         root.right = insertHelper(root.right,node );
     }
     return root;
 }
 public void display() {

 }
 private void displayHelper(Nodee root) {

 }
 public boolean search(int data) {
     return false;
 }
 private  boolean searchHelper(Nodee root, int data) {
     return false;
 }

 public void remove(int data) {

 }
 public Nodee removeHelper(Nodee root, int data) {
     return null;
 }

 private int successor(Nodee root) {
     return 0;
 }
 private int predeccessor(Nodee root) {
        return 0;
 }
}