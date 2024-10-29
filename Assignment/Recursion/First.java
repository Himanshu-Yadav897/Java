// Question 1 : For a given integer array of size N. You have to find all the occurrences
// (indices) of a given element (Key) and print them. Use a recursive function to solve this
// problem.
// Sample Input : arr[ ] = {3, 2, 4, 5, 6, 2, 7, 2, 2}, key = 2
// Sample Output : 1 5 7 8
public class First {
    public static void print(int arr[],int key,int idx){
        // Base Case
        if(idx == arr.length){
            return;
        }

        // kaam
        if(arr[idx] == key){
            System.out.print(idx + "  ");
        }
        // Recursion
        print(arr, key, idx + 1);
        }
    public static void main(String args[]){
       int  arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        print(arr, 2, 0);
    }
    
}
