// Subtree Of another tree
// Given the roots of two binary trees root and subroot, Return true if there is a subtree of root
//with the same structure and node values of subroot and false otherwise.
public class Subtree {
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

    public static boolean isIdentical(Node node , Node SubRoot){
        if(node == null && SubRoot == null){
            return true;
        }else if(node == null || SubRoot == null || node.data != SubRoot.data){
            return false;
        }


        if(!isIdentical(node.left, SubRoot.left)){
            return false;
        }

        if(!isIdentical(node.right, SubRoot.right)){
            return false;
        }

        return true;
    }

    public static boolean isSubtree(Node root , Node SubRoot){
        if(root == null){
            return false;
        }

        if(root.data == SubRoot.data){
            if(isIdentical(root, SubRoot)){
                return true;
            }
        }

        return isSubtree(root.left, SubRoot)  || isSubtree(root.right, SubRoot);
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

/*
        2
       / \
      4   5
 */

 Node subRoot = new Node(2);
 subRoot.left = new Node(4);
subRoot.right = new Node(5);
 

 System.out.println(isSubtree(root, subRoot));

    }
}
