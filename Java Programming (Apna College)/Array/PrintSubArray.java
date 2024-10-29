public class PrintSubArray {
    public static void Subarray(int number[]){
    int CurrSum = 0;
    int MaxSubArray = Integer.MIN_VALUE;
        for(int i = 0; i<number.length; i++){
            for(int j = i; j <number.length; j++)
            { CurrSum = 0;
                for(int k = i; k<=j; k++){
                    CurrSum += number[k];
                }
                System.out.println(CurrSum);
                if(MaxSubArray < CurrSum){
                    MaxSubArray = CurrSum;
                }

            }
        }
        System.out.println("Maximum Subarray is : " + MaxSubArray);
    }

    public static void main(String args[]){
        int number[] = { 1 , 2 ,3 ,4 ,5};
        Subarray(number);
    }
}
