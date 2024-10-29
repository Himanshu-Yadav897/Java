// Program to calculate diameter of a binary tree
//Diameter --> No. of nodes in the longest path between 2 leaves. 
public class Diameter2 {
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
static class Info {
    int ht;
    int diam;

    public Info(int ht, int diam) {
        this.ht = ht;
        this.diam = diam;
    }
}

public static Info diameter2(Node root) {
    if(root == null) {
        return new Info(0, 0);
    }

    Info left = diameter2(root.left);
    Info right = diameter2(root.right);

    int diamRoot = left.ht + right.ht + 1;

    int ht = Math.max(left.ht, right.ht) + 1;
    int diam = Math.max(diamRoot, Math.max(left.diam, right.diam));

    return new Info(ht, diam);
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

System.out.println(diameter2(root).diam);
}
}
