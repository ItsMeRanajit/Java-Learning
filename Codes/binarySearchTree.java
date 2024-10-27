import java.util.ArrayList;
// import java.util.Arrays;

public class binarySearchTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    // the inorder traversal of bst is always in sorted order
    public static Node insertNode(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val)
            root.left = insertNode(root.left, val);
        else
            root.right = insertNode(root.right, val);
        return root;
    }

    public static void inOrder(Node root) {
        if (root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static Node delete(Node root, int val) {
        if (root == null)
            return null;
        if (root.data > val)
            root.left = delete(root.left, val);
        else if (root.data < val)
            root.right = delete(root.right, val);
        else { // root.data == val
               // deleting the node
               // ..case 1 : leaf node
            if (root.left == null && root.right == null)
                return null;
            //// case 2: one child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            else {
                Node succ = inorderSuccessor(root.right);
                root.data = succ.data;
                root.right = delete(root.right, succ.data);
            }
        }
        return root;
    }

    public static Node inorderSuccessor(Node root) {
        while (root.left != null)
            root = root.left;
        return root;
    }

    public static void printInRange(Node root, int x, int y) {
        if (root == null)
            return;
        if (x <= root.data && y >= root.data) {
            printInRange(root.left, x, y);
            System.out.print(root.data + " ");
            printInRange(root.right, x, y);
        }

        else if (y <= root.data)
            printInRange(root.left, x, y);
        else {
            printInRange(root.right, x, y);
        }
    }

    public static String searchInTree(Node root, int key) { // O(height)
        if (root == null)
            return "key not found";
        if (root.data == key)
            return "key found";
        else if (key < root.data)
            return searchInTree(root.left, key);
        else
            return searchInTree(root.right, key);
    }

    public static void printPath(Node root, ArrayList<Integer> list) {
        if (root == null)
            return;
        list.add(root.data);
        if (root.left == null && root.right == null) {
            System.out.println(list);
        }
        // System.out.print(root.data + " ");
        printPath(root.right, list);
        // System.out.print(root.data + " ");
        printPath(root.left, list);

        list.remove(list.size() - 1);
    }

    public static void main(String args[]) {
        int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;
        for (int i : values) {
            root = insertNode(root, i);
        }
        System.out.println(root.data);
        inOrder(root);
        System.out.println();

        int key = 3;
        System.out.println(searchInTree(root, key));

        // delete(root, 1);
        delete(root, 1);
        inOrder(root);
        System.out.println();

        printInRange(root, 6, 10);
        System.out.println();

        ArrayList<Integer> list = new ArrayList<>();
        printPath(root, list);
    }
}
