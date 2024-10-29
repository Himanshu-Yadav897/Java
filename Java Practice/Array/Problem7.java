// Trapping Rain water
public class Problem7 {

    public static void TrapWater(int arr[]){
        // left array
        int max = Integer.MIN_VALUE;
        int lmax[] = new int[arr.length];
        for(int i =0; i<arr.length;i++){
            max = Math.max(max,arr[i]);
            lmax[i] = max;
        }


        // right
        max = Integer.MIN_VALUE;
        int rmax[] = new int[arr.length];
        for(int i = arr.length-1;i>=0;i--){
            max = Math.max(max, arr[i]);
            rmax[i]= max;
        }

        int curr = 0;
        int totalWater = 0;
        for(int i =0; i<arr.length;i++){
            int min = Math.min(lmax[i], rmax[i]);
            curr = min - arr[i];
            totalWater = totalWater + curr;

        }
        System.out.println(totalWater);
    }
    public static void main(String[] args) {
        int arr[]= {4,2,0,6,3,2,5};
        TrapWater(arr);
    }
}
