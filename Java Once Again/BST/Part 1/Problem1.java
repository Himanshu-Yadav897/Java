// Root 2 leaf path
import java.util.*;
public class Problem1 {
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

    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(val < root.data){
            root.left = insert(root.left, val);
        }else if(val > root.data){
            root.right = insert(root.right, val);
        }

        return root;

    }
    public static void print(ArrayList<Integer> path){
        for(int i = 0; i<path.size(); i++){
            System.out.print(path.get(i) + " ");
        }

        System.out.println();
    }

    public static void Root2Leaf(Node root, ArrayList<Integer> path){
        if(root == null){
            return ;
        }
        path.add(root.data);
        if(root.left == null && root.right == null){
            print(path);
        }

        Root2Leaf(root.left, path);
        Root2Leaf(root.right, path);

        path.remove(path.size()-1);
    }

    public static void main(String[] args) {
        int arr[] = { 8,5,3,1,4,6,10,11,14};
        Node root = null;

        for(int i = 0; i<arr.length; i++){
            root = insert(root, arr[i]);
        }

        ArrayList<Node> list = new ArrayList<>();
        Root2Leaf(root, new ArrayList<>() );
    }
}
