// Counting Sort
public class Problem4 {
    public static void sort(int arr[]){
        int largest = Integer.MIN_VALUE;

        for(int i = 0; i<arr.length;i++){
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest+1];

        for(int i = 0; i<arr.length;i++){
            count[arr[i]]++;
        }

        for(int i = count.length-1, j = 0;i>=0;i--){
            while(count[i] >0) {
                arr[j] = i;
                count[i]--;
                j++;
            }
        }
    }

    public static void print(int arr[]){
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = { 3,2,4,7,54,6,1,9};
        sort(arr);
        print(arr);
}
}
