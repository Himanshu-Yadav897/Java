// MAX SubArray Sum for all test cases using Kadanes algorithm
public class Problem44 {

    public static int checkpositive(int arr[]){
        int max = Integer.MIN_VALUE;
         for(int i = 0; i<arr.length;i++){
            max = Math.max(max, arr[i]);
         }

         return max;
    }
    public static int kadanes(int arr[]){
        int cs = 0;
        int max = Integer.MIN_VALUE;

        int check = checkpositive(arr);

        if (check < 0){
            return check;
        }

        for(int i = 0; i< arr.length;i++){
            cs = cs + arr[i];

            if(cs < 0){
                cs = 0;
            }

            max = Math.max(max, cs);
        }

        return max;
    }
    public static void main(String args[]) {
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        System.out.println(kadanes(arr));
    
    }
}
