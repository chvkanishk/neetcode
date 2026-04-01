class Solution{
    public int profit(int[] prices){
        int buy= prices[0];
        int profit = 0;

        for(int i=1;i<prices.length;i++){
            if(buy>prices[i]){
                buy= prices[i];
            }
            profit = Math.max(profit,prices[i]-buy);
        }
        return profit;
    }
}


public class BestTimetoBuyandSellStock {
    
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        Solution solution = new Solution();
        int result = solution.profit(prices);
        System.out.println(result);
        
    }
}
