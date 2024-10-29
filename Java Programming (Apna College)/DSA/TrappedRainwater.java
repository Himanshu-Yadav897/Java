
public class TrappedRainwater {
    public static int TrapWater(int height[]){
        // Left Auxilary Array  (Helper Array)
        int left[] = new int[height.length];
        left[0] = height[0];
        for(int i = 1; i<height.length;i++){
            left[i] = Math.max(height[i] , left[i-1]);
        }

         // Right Auxilary Array (Helper Array)
        int right[] = new int[height.length];
        right[height.length-1] = height[height.length-1];
        for(int i = height.length-2; i>=0;i--){
            right[i] = Math.max(height[i] , right[i+1]);
        }
        
        // loop for waterlevel and trappedrainwater
        int TP = 0;
        for(int i =0; i <height.length;i++){
        int WL = Math.min(left[i], right[i]);
        TP = TP + (WL - height[i]);
        }

       return TP;
       }

public static void main(String args[]){
    int height[] = {4,2,0,6,3,2,5};
    System.out.println(TrapWater(height));
}
}
