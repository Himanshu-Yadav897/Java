// Program to calculate the height of a binary tree
import java.util.*;
public class Sum {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

        public static int Sumoftree(Node root){
            if(root == null){
                return 0;
            }
            int leftH = Sumoftree(root.left);
            int rightH = Sumoftree(root.right);

            return leftH + rightH + root.data;
        }
        public static void main(String args[]){
            /*
                            1
                           /  \
                          2    3
                         / \    \    
                        4   5    6
                           
        */
        
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(Sumoftree(root));

        }
    }

