package leetcode;

public class LC0122_BestTimetoBuyandSellStockII {
    public int maxProfit(int[] prices) {
    	int size = prices.length;
    	int sum = 0;
    	for (int i = 1; i < size ; i++) {
            if (prices[i-1] < prices[i]) {
                sum += Math.abs(prices[i-1] - prices[i]);
            }
    	}
            
        return sum;
    }

	public static void main(String[] args) {
		LC0122_BestTimetoBuyandSellStockII t = new LC0122_BestTimetoBuyandSellStockII();
		System.out.println(t.maxProfit(new int[] { 7, 1, 5, 3, 6, 4 }));
		System.out.println(t.maxProfit(new int[] { 1, 2, 3, 4, 5 }));
		System.out.println(t.maxProfit(new int[] { 7, 6, 4, 3, 1 }));
	}

}
