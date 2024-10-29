// Given an Integers m,n and n integers, return true if the number of unique integers among  
// the n integers is greater than than or equal to m, else return false. 
// ( Integers appearing multiple times are all considered as 1 unique integer)
// Input1:
// 5
// 10
// 1 2 1 4 5 2 1 1 2 2
// Output1:
// false
// Input2:
// 9
// 15
// 1 4 5 0 9 8 3 7 3 2 6 8 11 15 23
// Output2:
// true

import java.util.*;

public class Problem34 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0;i< n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int i = 0;
        int count = 0;

        while(i<n){
            count++;
            while(i< n-1 && arr[i+1] == arr[i] ){
                i++;
            }
            i++;
        }

        if(count >= m){
            System.out.println("true");
        }else{
            System.out.println("False");
        }
        
    }
}
