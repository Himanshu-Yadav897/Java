// Merge 2 BST

import java.util.ArrayList;

public class Problem2 {

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

    public static void getInOrder(Node root , ArrayList<Integer> arr){
        if(root == null){
            return ;
        }

        getInOrder(root.left, arr);
        arr.add(root.data);
        getInOrder(root.right, arr);
    }

    public static Node CreateBST(ArrayList<Integer> arr, int st, int end){
        if(st > end){
            return null;
        }

        int mid = (st + end)/2;
        Node root = new Node(arr.get(mid));

        root.left = CreateBST(arr, st, mid-1);
        root.right = CreateBST(arr, mid+1, end);

        return root;
    }

    public static Node mergeBST(Node root1, Node root2){
        // step 1
        ArrayList<Integer> arr1 = new ArrayList<>();
        getInOrder(root1, arr1);

        ArrayList<Integer> arr2 = new ArrayList<>();
        getInOrder(root2, arr2);

        int i = 0,  j = 0;
        ArrayList<Integer> finalArr = new ArrayList<>();
        while( i < arr1.size() &&  j < arr2.size()){
            if(arr1.get(i) <= arr2.get(j)){
                finalArr.add(arr1.get(i));
                i++;
            }else{
                finalArr.add(arr2.get(j));
                j++;
            }
        }


        while(i < arr1.size()){
            finalArr.add(arr1.get(i));
            i++;
        }

        while(j < arr2.size()){
            finalArr.add(arr2.get(j));
            j++;
        }


        return CreateBST(finalArr, 0, finalArr.size()-1);
    }

    public static void Inorder(Node root){
        if(root == null){
            return ;
        }

        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);
    }
    public static void main(String[] args) {
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        Node root = mergeBST(root1, root2);
        Inorder(root);
    }
}
