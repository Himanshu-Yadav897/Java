// Program to find the second largest element in an array.
public class Problem13 {
    public static int FindLargest(int arr[]){
        int max = Integer.MIN_VALUE;
        
        for(int i =0; i<arr.length;i++){
            if(arr[i] > max ){
                max = arr[i];
            }
        }
        return max;
    }

    public static int SecondLargest(int arr[]){
       int max =  FindLargest(arr);
      
       for(int i =0; i<arr.length;i++){
        if(arr[i] == max){
            arr[i] = Integer.MIN_VALUE;
        }
       }
       int SecondMax = FindLargest(arr);
       

       return SecondMax;
    }
   
    public static void main(String args[]){
        int arr[] = {51,3,50,9,2,13,11};
        System.out.println(SecondLargest(arr));

       

    }
}
