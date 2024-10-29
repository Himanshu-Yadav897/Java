public class SelectionSort {
    public static void Sort(int Arr[]){
      
   for (int i = 0; i< Arr.length-1;i++){
    int minPos = i;
    for(int j = i+1; j<Arr.length;j++){
        if(Arr[minPos]>Arr[j]){
          minPos = j;
        }
    }
    int temp = Arr[minPos];
    Arr[minPos] = Arr[i];
    Arr[i] = temp;
   }
   for(int k = 0; k<Arr.length; k++){
    System.out.print(Arr[k]);
   }
 
}
    public static void main(String args[]){
        int Arr[] = { 5,2,3,1,4};
        Sort(Arr);
    }
}
