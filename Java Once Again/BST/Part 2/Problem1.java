public class Problem1 {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int BSTMAX = 0;

    static class Info {
        boolean isBST;
        int size;
        int min;
        int max;

        Info(boolean isBST, int size, int min, int max) {
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }

    public static Info largestBST(Node root) {
        if (root == null) {
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }

        Info leftSubtree = largestBST(root.left);
        Info rightSubtree = largestBST(root.right);

        int size = leftSubtree.size + rightSubtree.size + 1;
        int min = Math.min(root.data, Math.min(leftSubtree.min, rightSubtree.min));
        int max = Math.max(root.data, Math.max(leftSubtree.max, rightSubtree.max));

        if (leftSubtree.isBST && rightSubtree.isBST && root.data > leftSubtree.max && root.data < rightSubtree.min) {
            BSTMAX = Math.max(BSTMAX, size);
            System.out.println("Node " + root.data + " is root of a BST of size " + size);
            return new Info(true, size, min, max);
        }

        System.out.println("Node " + root.data + " is NOT root of a BST");
        return new Info(false, size, min, max);
    }

    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(60);
        root.left.left = new Node(5);
        root.left.right = new Node(20);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);

        largestBST(root);
        System.out.println("Size of the largest BST is: " + BSTMAX);
    }
}
