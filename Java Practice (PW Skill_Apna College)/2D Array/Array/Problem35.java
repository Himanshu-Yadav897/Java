
// Minimum Platforms
//  Given arrival and departure times of all trains that reach a railway station. Find the minimum number
//  of platforms required for the railway station so that no train is kept waiting.
//  Consider that all the trains arrive on the same day and leave on the same day. Arrival and departure
//  time can never be the same for a train but we can have arrival time of one train equal to departure time
//  of the other. At any given instance of time, same platform can not be used for both departure of a train
//  and arrival of another train. In such cases, we need different platforms.

import java.util.*;

 public class Problem35{

    public static int findPlatform(int arr[], int dep[], int n){
        Arrays.sort(arr);
        Arrays.sort(dep);

        int plat = 1;
        int result = 1;

        int i = 1,j = 0;
        while (i<n && j <n) {
            if(arr[i] <= dep[j]){
                plat++;
                i++;
            }else if (arr[i] > arr[j]){
                plat--;
                j++;
            }
            result = Math.max(result, plat);
        }
        return result;
    }
    public static void main(String[] args)
    {
        int arr[] = { 900, 940, 950, 1100, 1500, 1800 };
        int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 };
        int n = arr.length;
        System.out.println(
            "Minimum Number of Platforms Required = "
            + findPlatform(arr, dep, n));
    }
}
