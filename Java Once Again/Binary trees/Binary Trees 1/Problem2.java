// Subtree of a binary Tree
public class Problem2 {
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

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    public static boolean isIdentical(Node root, Node Subroot){
        if(root == null && Subroot == null){
            return true;
        }else if(root == null || Subroot == null || root.data != Subroot.data){
            return false;
        }

        if(isIdentical(root.left, Subroot.left)){
            return false;
        }

        if(isIdentical(root.right, Subroot.right)){
            return false;
        }

        return true;
    }

    public static boolean subtree(Node root, Node Subroot){
        if(root == null){
            return false;
        }

        if(root.data == Subroot.data){
            if(isIdentical(root, Subroot)){
                return true;
            }
        }

        return subtree(root.left, Subroot) || subtree(root.right, Subroot);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);


        Node subNode = new Node(2);
        subNode.left = new Node(4);
        subNode.right = new Node(9);

        System.out.println(subtree(root, subNode));
    }

}
