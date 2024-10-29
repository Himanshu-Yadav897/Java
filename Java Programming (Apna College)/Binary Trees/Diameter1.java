// Program to calculate diameter of a binary tree
//Diameter --> No. of nodes in the longest path between 2 leaves. 
public class Diameter1 {
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
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int leftH = height(root.left);
        int rightH = height(root.right);

        return Math.max(leftH, rightH) + 1;
    }

    public static int diameter(Node root){
        if(root == null){
            return 0;
        }

        int leftDiam = diameter(root.left);
        int rightDiam = diameter(root.right);
        int LHeight = height(root.left);
        int RHeight = height(root.right);

        int selfdiam = LHeight + RHeight + 1;

        return Math.max(selfdiam , Math.max(rightDiam, leftDiam));
    }


    public static void main(String arsg[]){
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

        System.out.println(diameter(root));
    }
}
