// Program to create a 2D Array and searching the element

import java.util.*;

public class problem1 {

    public static int[] search(int matrix[][], int key) {
        int arr[] = new int[2];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (key == matrix[i][j]) {
                    arr[0] = i;
                    arr[1] = j;
                    return arr;
                }
            }
        }
        arr[0] = -1;
        arr[1] = -1;
        return arr;
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int arr[] = search(matrix, 4);
        System.out.println(arr[0] + " " + arr[1]);
    }
}
