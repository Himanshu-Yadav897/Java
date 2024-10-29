
public class MaxSubArraySumByKadanes {
    public static void Kadanes(int number[]){
    int CurrSum = 0;
    int MaxSubArray = Integer.MIN_VALUE;
   
        for(int i =0; i<number.length; i++){
            CurrSum = CurrSum + number[i];
            if(CurrSum<0){
                CurrSum = 0;
            }
            MaxSubArray = Math.max(CurrSum,MaxSubArray);
        }
        
        System.out.println("Maximum Subarray is : " + MaxSubArray);
    }

    public static void main(String args[]){
        int number[] = { -2 ,-3, 4,-1,-2,1,5,-3};
        Kadanes(number);
    }
}
