// Modified Bubble Sort
public class ModifiedBubbleSort  {
        public static void Sort(int Arr[]){
       for (int i = 0; i< Arr.length-1;i++){
        boolean swapped = false;
        for(int j =0; j<Arr.length-1-i;j++){
            if(Arr[j]>Arr[j+1]){
                int temp = Arr[j];
                Arr[j] = Arr[j+1];
                Arr[j+1] = temp;
                swapped = true;
            }
            
        }
        if(swapped == false){
            break;
        }
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
    
