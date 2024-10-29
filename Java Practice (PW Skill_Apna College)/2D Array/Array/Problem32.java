// *******************=============== TWO POINTERS APPROACH ====================****************

//  Given an array of integer 'a', move all the even integers at the beginning of the array
// followed by all the odd integers. The relative order of odd or even integers does not matter. Return any 
// array that satifies teh condition.
// Input :
// [1,2,3,4,5]
// Output :
// [4,2,3,1,5] 
public class Problem32 {
    public static void sort(int arr[]){
        int i = 0;
        int j = arr.length-1;

        while(i <= j){
            if((arr[i] %2 == 1) && (arr[j] %2 == 0)){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--; 
            }else if( arr[i] % 2 == 0){
                i++;
            }else{
                j--;
            }
        }
    }
    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 5, 7, 8, 8, 9, 10, 14 };
        System.out.println("Array Before the sort");
        print(arr);
        sort(arr);
        System.out.println("Array After the Sort:- ");
        print(arr);
    }
}
