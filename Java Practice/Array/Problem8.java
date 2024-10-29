// Buy & Sell Stocks
public class Problem8 {
    public static void BuySellStock(int arr[]){
        int buyPrice = Integer.MAX_VALUE;
        int max = 0;

        for(int i = 0; i<arr.length;i++){
            if(buyPrice < arr[i]){
                int Price = arr[i] - buyPrice;
                max = Math.max(max,Price);
            }else{
                buyPrice = arr[i];
            }
        }

        System.out.println(max);
    }
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        BuySellStock(arr);
    }
}
