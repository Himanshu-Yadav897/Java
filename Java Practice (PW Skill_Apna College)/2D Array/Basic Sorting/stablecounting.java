// program of  stable counting sort ---> explaination is on the java Pw skill
public class stablecounting {
    public static void sort(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length;i++){
            max = Integer.max(max, arr[i]);
        }

        int output[] = new int[arr.length];
        int count[] = new int[max + 1];
        for(int i = 0; i<arr.length;i++){
            count[arr[i]]++;
        }

        // prefix array of count
        for(int i = 1; i<count.length;i++){
            count[i] += count[i+1];
        }

        for(int i = arr.length;i<)

    }
    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6 };
        print(arr);
        sort(arr);
        print(arr);
    }
}
