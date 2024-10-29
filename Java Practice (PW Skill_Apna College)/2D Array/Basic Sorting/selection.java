// Program to Apply the concept of Selection sorting
public class selection {
    public static void sort(int arr[]){
        int n = arr.length;
        int minPos;
        for(int i = 0; i<n-1;i++){
            minPos = i;
            for(int j = i+1; j<arr.length;j++){
                if( arr[j] < arr[minPos] ){
                    minPos = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;
        }
    }
    public static void print(int arr[]){
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        print(arr);
        sort(arr);
        print(arr);
        
    }
}
