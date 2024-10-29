public class MaxSubArraySum {
    public static void Subarray(int number[]){
    int CurrSum = 0;
    int MaxSubArray = Integer.MIN_VALUE;
    int prefix[] = new int[number.length];

    prefix[0] = number[0];
     
    for(int i = 1; i <prefix.length; i++){
        prefix[i] = prefix[i- 1] + number[i];
    }

        for(int i = 0; i<number.length; i++){
            for(int j = i; j <number.length; j++){
                CurrSum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];

                if(MaxSubArray < CurrSum){
                    MaxSubArray = CurrSum;
                }

            }
        }
        System.out.println("Maximum Subarray is : " + MaxSubArray);
    }

    public static void main(String args[]){
        int number[] = { 1 , -2, 6,-1,3};
        Subarray(number);
    }
}
