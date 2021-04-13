package leetcode;

public class LC0122_BestTimetoBuyandSellStockII_X {
    public int maxProfit(int[] prices) {
    	int len = prices.length;
    	
    	int sum = 0;
    	for (int i = 1 ; i < len ; i++) {
    		if (prices[i-1] < prices[i]) {
				sum += Math.abs(prices[i-1] - prices[i]);
			}
    	}
        
        return sum;
    }
	
	public static void main(String[] args) {
        LC0122_BestTimetoBuyandSellStockII_X t = new LC0122_BestTimetoBuyandSellStockII_X();
		
		System.out.println(t.maxProfit(new int[] {7,1,5,3,6,4} ));
		System.out.println(t.maxProfit(new int[] {7,6,4,3,1} ));
		System.out.println(t.maxProfit(new int[] {2,4,1} ));
	}
}
