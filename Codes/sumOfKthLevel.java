import java.util.LinkedList;
import java.util.Queue;

public class sumOfKthLevel {
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

        public void levelorderTraverse_BFS(Node root, int k) {
            int sum = 0;
            if (k == 0) {
                System.out.println(root.data);
                return;
            }
            Queue<Node> q = new LinkedList<>();
            if (root == null)
                return;

            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node curr = q.remove();
                if (curr == null) {
                    k--;
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
                if (k == 1 && !q.isEmpty()) {
                    Node c2 = q.remove();
                    while (c2 != null) {
                        sum += c2.data;
                        c2 = q.remove();
                    }
                    System.out.println(sum);
                    return;
                }
            }
            if (k != 0)
                System.out.println("level does not exists in the tree");
        }

    }

    public static void main(String args[]) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        // the tree is like 1 2 4 5 3 6 preorder traverse

        binaryTree bt = new binaryTree();

        Node root = bt.buildTree(nodes);
        System.out.println("root of the tree " + root.data);

        System.out.println("Sum of nodes at level " + 2 + " is ");
        bt.levelorderTraverse_BFS(root, 2);

    }
}
