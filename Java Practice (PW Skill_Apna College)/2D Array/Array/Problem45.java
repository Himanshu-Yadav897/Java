// Program to calculate the trapping Rain Water
public class Problem45 {
    public static int trapwater(int arr[]){
        int n = arr.length;
        // Left max boundary
        int left[] = new int[n];
        left[0] = arr[0];
        for(int i = 1; i<n;i++){
            left[i] = Math.max(arr[i],left[i-1]);
        }


        // Right Max Boundary
        int right[] = new int[n];
        right[n-1] = arr[n-1];
        for(int i = n-2;i>=0;i--){
            right[i] = Math.max(arr[i], right[i+1]);
        }

        // TrapWater
        int trapwater = 0;
        for(int i = 0; i<n;i++){
            int waterLevel = Math.min(left[i], right[i]);

            trapwater = trapwater + (waterLevel - arr[i]);
        }
        return trapwater;
        
    }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        int trapwater = trapwater(height);
        System.out.println(trapwater);
    }
}
