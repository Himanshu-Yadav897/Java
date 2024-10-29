
public class Problem30 {
    // Given an array of positive and negative numbers, arrange them in an alternate
    // fashion such that
    // every positive number is followed by a negative and vice-versa maintaining
    // the order of appearance.
    // The number of positive and negative numbers need not be equal. Begin with a
    // negative number.
    // If there are more positive numbers, they appear at the end of the array. If
    // there are more negative
    // numbers, they too appear at the end of the array.

    // Input 1:
    // N = 6
    // arr[] = {1, 2, 3, -4, -1, 4}
    // Output 1:
    // arr[] = {-4, 1, -1, 2, 3, 4}
    // Input 2:
    // N = 4
    // arr[] = {1, 2, 3, -4}
    // Output 2:
    // arr[] = {-4, 1, 2, 3}
        public static int partition(int arr[]){
        int i = 0;
        int j = 0;

        while(i < arr.length){
            if(arr[i] < 0 ){
             int temp = arr[i];
             arr[i] = arr[j];
             arr[j] = temp;
             i++;
             j++;
            }else{
                i++;
            }
        }
        return j;
    }


    public static void ReAarrange(int arr[]){
        int p = partition(arr);

        for(int i=0; (p < arr.length && i < p); p++, i+=2){
            int temp = arr[i];
            arr[i] = arr[p];
            arr[p] = temp;
        }
    }

    public static void print(int arr[]){
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        int arr[] = { 9, -3, 5, -2, -8, -6, 1, 3,5,7,8 };
        ReAarrange(arr);
        print(arr);
    }
}
