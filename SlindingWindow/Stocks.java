public class Stocks {
    public static void main(String[] args) {
        int[] prices = new int[]{7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    static int maxProfit(int[] prices){
        int buy = 0, sell = buy + 1;
        int maxprofit = 0, current = 0;

        while(sell <= prices.length - 1){
            if(prices[buy] >= prices[sell]){
                buy++;
                sell = buy + 1;
            }else{
                current = prices[sell] - prices[buy];
                maxprofit = Math.max(current, maxprofit);
                sell++;
            }            
        }
        return maxprofit;
    }
}