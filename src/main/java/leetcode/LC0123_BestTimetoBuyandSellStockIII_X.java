package leetcode;

public class LC0123_BestTimetoBuyandSellStockIII_X {
    public int maxProfit(int[] prices) {
		int len = prices.length;
		int buy1 = Integer.MAX_VALUE, buy2 = Integer.MAX_VALUE;
		int sell1 = 0, sell2 = 0;
		for (int i = 0 ; i < prices.length ; i++) {
			buy1  = Math.min(buy1,  prices[i]);
			sell1 = Math.max(sell1, prices[i] - buy1);
			// The second purchase amount must be excluded from the first sale amount 
			// to be the sum of the first and second purchases.
			buy2  = Math.min(buy2,  prices[i] - sell1); 
			sell2 = Math.max(sell2, prices[i] - buy2);
			/*
			System.out.print("buy1 [" + buy1  + "] " );
			System.out.print("sell1[" + sell1 + "] " );
			System.out.print("buy2 [" + buy2  + "] " );
			System.out.print("sell2[" + sell2 + "]\n" );
			*/
		}

		return sell2;
    }
	
	public static void main(String[] args) {
        LC0123_BestTimetoBuyandSellStockIII_X t = new LC0123_BestTimetoBuyandSellStockIII_X();
		
		System.out.println(t.maxProfit(new int[] { 3, 3, 5, 0, 0, 3, 1, 4 }));
	}
}
