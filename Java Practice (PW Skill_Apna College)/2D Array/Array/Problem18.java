// Given an unsorted array arr[] of size N having both negative and positive integers, place all negative 
// elements at the end of array without changing the order of positive elements and negative elements.

public class Problem18 {
    public static void separate(int arr[]){
        int temp[] = new int[arr.length];
        int j=0;
        for(int i =0; i<arr.length;i++){
            if(arr[i] >= 0){
                temp[j] = arr[i];
                j++;
            }
        }
        if(j == arr.length || j== 0 ){
            return;
        }

        for(int i =0; i<temp.length;i++){
            if(arr[i] < 0){
                temp[j] = arr[i];
                j++;
            }
        }

        for(int i =0; i<arr.length;i++){
            arr[i] = temp[i];
        }
    }
    public static void main(String args[]){
        int arr[] = {1,-1,-3,-2,7,5,11,6};

        separate(arr);

         for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    }

