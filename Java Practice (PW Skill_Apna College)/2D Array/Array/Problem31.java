// ================ TWO POINTERS APPROACH =====================


// Sort an Array Consisting of only 0s and 1s.
// Example :- arr[] = {1,0,1,0,0,1,0,1,1,0,1,0,0}
// OUTPUT:- {0,0,0,0,0,0,0,1,1,1,1,1,1}

public class Problem31 {
    public static void print(int arr[]){
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void sort(int arr[]){
        int i = 0;
        int j = arr.length-1;

        while(i < j){
            if(arr[i] == 1 && arr[j] == 0 ){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }else if(arr[i] == 0){
                i++;
            }else{
                j--;
            }
        }
    }
    public static void main(String args[]){
        int arr[] = {1,0,1,0,0,1,1,1,1,0,1,0,0};
        System.out.println("Array Before Sorting:- ");
        print(arr);
        System.out.println("Array After Sorting :-");
        sort(arr);
        print(arr);

    }
}
