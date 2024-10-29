public class CountingSort {
    public static void Sort(int arr[]){
      int largest = Integer.MIN_VALUE;
   for (int i = 0; i< arr.length;i++){
    largest = Math.max(largest,arr[i]);
   }
   int count[] = new int[largest+ 1];
   for (int i = 0; i<arr.length;i++){
    count[arr[i]]++;
   }
   //Sorting
   int j = 0;
   for(int i = 0; i< count.length;i++){
    while(count[i]>0){
        arr[j] = i;
        j++;
        count[i]--;
    }
   }
   for(int k = 0; k<arr.length; k++){
    System.out.print(arr[k]);
   }
 
}
    public static void main(String args[]){
        int arr[] = { 5,2,3,1,4};
        Sort(arr);
    }
}
