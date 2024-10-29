public class InsertionSort {
    public static void Sort(int Arr[]){
      
   for (int i = 1; i< Arr.length;i++){
    int curr = Arr[i];
    int prev = i -1;
    // Finding out the correct position to insert
    while(prev >=0 && Arr[prev] > curr){
        Arr[prev +1] = Arr[prev];
        prev--;
    }
    // Insertion
    Arr[prev +1 ] = curr;
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
