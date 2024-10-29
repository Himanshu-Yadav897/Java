// // Given two arrays a[] and b[] of size n and m respectively where m >= n. The task is to find 
//  union between these two arrays and print the number of elements of the union set.
//  Union of the two arrays can be defined as the set containing distinct elements from both 
//  the arrays. If there are repetitions, then only one occurrence of element should be printed 
//  in the union.

import java.util.*;

public class Problem19 {
    public static int union(int arr1[], int arr2[]){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i = 0, j =0;
        int m = arr1.length;
        int n = arr2.length;
        int count =0;
        while(m>i && n>j){
            if(arr1[i] > arr2[j]){
                count++;
                j++;
            }else if(arr1[i] < arr2[j]){
                count++;
                i++;
            }
            else if(arr1[i] == arr2[j]){
                count++;
                i++;
                j++;
            }
        }


        for(;i<n;i++){
         count++;
         i++;   
        }


        for(; j<m;j++){
            count++;
            j++;
        }

        return count;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of arr1: ");
        int m = sc.nextInt();
        System.out.println("Enter the size of arr2: ");
        int n = sc.nextInt();

        int arr1[] = new int[m];
        int arr2[] = new int[n];

        System.out.println("Enter the elements of arr1: ");
        for(int i =0; i<m;i++){
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the elements of arr2: ");
        for(int j =0; j< n; j++){
            arr2[j] = sc.nextInt();
        }

        System.out.println("The Size of the union array: "+union(arr1, arr2));
    }
}
