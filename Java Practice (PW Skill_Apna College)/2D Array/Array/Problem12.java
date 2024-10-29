// Find the unique number in a given array, where all the elements are being repeated twice with one value 
// being unique.
// *Only positive elements in array.
public class Problem12 {
    public static int Unique(int arr[]){
        int ans= -1;
        for(int i =0; i<arr.length;i++){
            for(int j = i+1; j<arr.length;j++){
                if(arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }

        for(int i =0; i<arr.length; i++){
            if(arr[i] > -1){
                ans = arr[i];
            }
        }
        return ans;
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,8,8,4,7,2,1,3};
        System.out.println(Unique(arr));

    }
}
