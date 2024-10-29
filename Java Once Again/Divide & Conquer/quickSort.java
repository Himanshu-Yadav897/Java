public class quickSort {
    public static void print(int arr[]){
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void quickSort1(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }

        int pivotIdx = partition(arr, si, ei);
        quickSort1(arr, si, pivotIdx -1);
        quickSort1(arr, pivotIdx + 1, ei);
    }

    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];

        int i = si -1;

        for(int j = si; j<ei; j++ ){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }

        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[ei] = temp;
        return i;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,7,2,1,8,6,3};
        quickSort1(arr, 0, arr.length-1);
        print(arr);

    }
}
