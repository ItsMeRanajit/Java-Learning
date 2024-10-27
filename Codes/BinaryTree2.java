import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree2 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class binaryTree {
        int idx = -1;

        public Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1)
                return null;
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

        public void preorderTraverse(Node root) {
            if (root == null)
                return;
            System.out.print(root.data + " ");
            preorderTraverse(root.left);
            preorderTraverse(root.right);
        }

        public void inorderTraverse(Node root) {
            if (root == null)
                return;
            preorderTraverse(root.left);
            System.out.print(root.data + " ");
            preorderTraverse(root.right);
        }

        public void postorderTraverse(Node root) {
            if (root == null)
                return;
            preorderTraverse(root.left);
            preorderTraverse(root.right);
            System.out.print(root.data + " ");
        }

        public void levelorderTraverse_BFS(Node root) {
            Queue<Node> q = new LinkedList<>();
            if (root == null)
                return;

            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node curr = q.remove();
                if (curr == null) {
                    System.out.println();
                    if (q.isEmpty())
                        break;
                    else
                        q.add(null);
                } else {
                    System.out.print(curr.data);

                    if (curr.left != null)
                        q.add(curr.left);
                    if (curr.right != null)
                        q.add(curr.right);
                }
            }
        }

    }

    public static void main(String args[]) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        // the tree is like 1 2 4 5 3 6 preorder traverse

        binaryTree bt = new binaryTree();

        Node root = bt.buildTree(nodes);
        System.out.println("root of the tree " + root.data);

        System.out.println("preorder traversed tree");
        bt.preorderTraverse(root);

        System.out.println();

        System.out.println("inorder traversed tree");
        bt.inorderTraverse(root);

        System.out.println();

        System.out.println("postorder traversed tree");
        bt.postorderTraverse(root);

        System.out.println();

        System.out.println("levelorder traversed tree");
        bt.levelorderTraverse_BFS(root);

    }
}
