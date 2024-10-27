public class binaryTreeSumNode {
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

        public int sumNode(Node root) {
            if (root == null)
                return 0;
            int leftSum = sumNode(root.left);
            int rightSum = sumNode(root.right);
            return leftSum + rightSum + root.data;
        }
    }

    public static void main(String args[]) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        // the tree is like 1 2 4 5 3 6 preorder traverse

        binaryTree bt = new binaryTree();

        Node root = bt.buildTree(nodes);
        System.out.println("root of the tree " + root.data);

        System.out.println("the sum of nodes is " + bt.sumNode(root));
    }
}
