// Program to find out the minimum distance between two nodes
public class MInDist {
  static class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
  }  
  public static Node lca1(Node root , int n1, int n2){
    if(root == null || root.data == n1 || root.data == n2){
        return root;
    }
    Node left = lca1(root.left , n1,n2);
    Node right = lca1(root.right , n1 ,n2);

   if(right == null){
    return left;
   }
   if(left == null){
    return right;
   }

   return root;
    }

    public static int lcaDist(Node root , int n){
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }

        int leftDist = lcaDist(root.left , n);
        int rightDist = lcaDist(root.right , n);
        if(leftDist == -1 && rightDist == -1){
            return -1;
        }else if(leftDist == -1){
            return rightDist +1;
        }else{
            return leftDist +1;
        }
    }


    public static int minimum(Node root , int n1 ,int n2){
        Node lca = lca1(root , n1, n2);
        int dist1 = lcaDist(lca , n1);
        int dist2 = lcaDist(lca , n2);
        return dist1 + dist2;
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
        

        System.out.println(minimum( root , 4 ,6));

  }
}
