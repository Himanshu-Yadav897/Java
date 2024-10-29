public class BinaryDiameter {
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

    // Height of a tree
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int leftH = height(root.left);
        int rightH = height(root.right);

        return Math.max(leftH,rightH) + 1;
    }
    // Diameter of a tree
    public static int Diameter(Node root){
        if(root == null){
            return 0;
        }

        int leftDia = Diameter(root.left);
        int rightDia = Diameter(root.right);
        int leftH = height(root.left);
        int rightH = height(root.right);

        int self = leftH + rightH + 1;

        return Math.max(leftDia,Math.max(rightDia,self) );
        
    }

    static class Info{
        int dia;
        int ht;
        Info(int dia, int ht){
            this.dia = dia;
            this.ht = ht;
        }
    }

    public static Info Diameter2(Node root){
        if(root == null){
            return new Info(0, 0);
        }

        Info leftInfo = Diameter2(root.left);
        Info rightInfo = Diameter2(root.right);

        int dia = Math.max(Math.max(leftInfo.dia, rightInfo.dia),leftInfo.ht +  rightInfo.ht + 1 );

        int ht = Math.max(leftInfo.ht , rightInfo.ht) + 1;

        return new Info(dia, ht);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(Diameter2(root).dia);

    }
}
