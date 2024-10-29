// Program to execute the max Subarray Sum by prefix sum approach
public class Problem5 {
    public static void subArray(int arr[]) {
        int curr = 0;
        int max = Integer.MIN_VALUE;

        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        // Prefix sum
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if(i ==0){
                    curr = prefix[j];
                }else{
                curr = prefix[j] - prefix[i - 1];

                }
                max = Math.max(curr, max);
            }
        }

        System.out.println(max);

    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        subArray(arr);
    }
}
