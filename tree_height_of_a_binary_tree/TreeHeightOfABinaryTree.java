import java.util.Scanner;

public class TreeHeightOfABinaryTree {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int n = reader.nextInt();
        BinarySearchTree tree = new BinarySearchTree();
        for(int i = 0; i < n; i++){
            int v = reader.nextInt();
            tree.insert(v);
        }

        System.out.println(tree.getHeight());
        reader.close();
    }

}


