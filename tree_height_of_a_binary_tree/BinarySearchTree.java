public class BinarySearchTree {
    class Node{
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
        }
    }

    private Node root;

    void insert(int value){
        root = insertRecursively(root, value);
    }

    private Node insertRecursively(Node n, int v){
        if(n == null){
            return new Node(v);
        }

        if(v < n.value){
            n.left = insertRecursively(n.left, v);
        } else if (v > n.value) {
            n.right = insertRecursively(n.right, v);
        }

        return n;
    }

    int getHeight(){
        return getHeightRec(root);
    }

    private int getHeightRec(Node n){
        if(root == null){
            return -1;
        }

        int leftHeight = getHeightRec(n.left);
        int rightHeight = getHeightRec(n.right);

        return Math.max(leftHeight, rightHeight)+1;
    }
}
