// Given two Arrays A and B of equal length n. Pair each element of Array A to an element in Array B. Such
// that Sum S of absolute differences of all the pairs is minimum.
// A[1,2,3]
// B[2,1,3]
// ans = 0
import java.util.*;
public class MInimumDifference { // O(nlogn)
    public static void main(String args[]){
        int A[] = {1 ,2 ,3};
        int B[] = {2 ,1 ,3};

        Arrays.sort(A);
        Arrays.sort(B);

        int minDiff = 0;

        for(int i = 0; i<A.length; i++){
            minDiff = minDiff + Math.abs(A[i] - B[i]);
        }

        System.out.println(minDiff);
    }
}
