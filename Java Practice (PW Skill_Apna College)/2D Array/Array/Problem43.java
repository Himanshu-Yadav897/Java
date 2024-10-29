// Program to calculate the maxSubarray with prefix array
public class Problem43 {

    public static void maxSubarray(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (i == 0) {
                    currSum = prefix[j];
                } else {
                    currSum = prefix[j] - prefix[i - 1];
                }
                maxSum = Math.max(maxSum, currSum);
            }
        }
        System.out.println(maxSum);
    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };

        maxSubarray(arr);
    }
}
