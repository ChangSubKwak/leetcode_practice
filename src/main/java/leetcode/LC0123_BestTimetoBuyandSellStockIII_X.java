package leetcode;

public class LC0123_BestTimetoBuyandSellStockIII_X {
    public int maxProfit(int[] prices) {
    	int size = prices.length;
    	int sum = 0;
    	
    	int b1 = Integer.MAX_VALUE;
    	int b2 = Integer.MAX_VALUE;
    	int s1 = 0;
    	int s2 = 0;
    	
    	for (int i = 0; i < size ; i++) {
    		b1 = Math.min(b1, prices[i]);
    		s1 = Math.max(s1, prices[i] - b1);		// 누적된 수익 --> prices[i] - b1
    		b2 = Math.min(b2, prices[i] - s1);		// 누적된 지출 --> prices[i] - s1 --> 앞에서 최대값을 구했기 때문 
    		s2 = Math.max(s2, prices[i] - b2);
    		
    		System.out.printf("prices[%d] = %d --> ", i, prices[i]);
            System.out.print("buy1[" + b1  + "] " );
            System.out.print("sell1[" + s1 + "] " );
            System.out.print("buy2[" + b2  + "] " );
            System.out.print("sell2[" + s2 + "]\n" );
    	}
            
        return s2;
    }

	public static void main(String[] args) {
		LC0123_BestTimetoBuyandSellStockIII_X t = new LC0123_BestTimetoBuyandSellStockIII_X();
		System.out.println(t.maxProfit(new int[] { 3, 3, 5, 0, 0, 3, 1, 4 }));
		System.out.println(t.maxProfit(new int[] { 1, 2, 3, 4, 5 }));
		System.out.println(t.maxProfit(new int[] { 7, 6, 4, 3, 1 }));
		System.out.println(t.maxProfit(new int[] { 1 }));
	}

}
