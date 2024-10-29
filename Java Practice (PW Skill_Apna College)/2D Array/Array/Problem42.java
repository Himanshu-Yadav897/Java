// Program to calculate the maxSubarray BruteForce

public class Problem42 {
    public static void maxSubarray(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum = currSum + arr[k];
                    System.out.print(arr[k] + " ");
                }
                System.out.print("==>" + currSum);
                maxSum = Math.max(maxSum, currSum);
                System.out.println();
            }
            System.out.println();
        }

        System.out.println(maxSum);
    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };

        maxSubarray(arr);

    }
}