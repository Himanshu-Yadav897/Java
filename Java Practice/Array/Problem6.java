// Program to find the Max Subarray Sum (Kadane's Alogorithm)
public class Problem6 {

    public static void Subarray(int arr[]){
        int cs = 0;
        int max= Integer.MIN_VALUE;

        for(int i = 0; i<arr.length;i++){
            cs = cs + arr[i];

            if(cs < 0){
                cs = 0;
            }

            max = Math.max(max, cs);
        }
        System.out.println(max);
    }
    public static void main(String args[]){
        int arr[] = { 1, -2, 6, -1, 3 };
        Subarray(arr);
    }
}
