
public class BuyAndSellStock {
    public static void Stock(int Price[]){
    int MaxProfit = 0;
    int BuyPrice  = Integer.MAX_VALUE;
    for (int i= 0;i <Price.length;i++ ){
        if(BuyPrice < Price[i]){
            int Profit = Price[i] - BuyPrice;
            MaxProfit = Math.max(MaxProfit , Profit);
        }else {
            BuyPrice = Price[i];
        }
    }
    System.out.println(MaxProfit);
}
    public static void main(String args[]){
        int Price[] = { 7,1,5,3,6,4};
        Stock(Price);
    }
}
