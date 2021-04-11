package leetcode;

public class LC0121_BestTimetoBuyandSellStock_X {
    public int maxProfit(int[] prices) {
    	int size = prices.length;
    	
    	int max = 0;
    	int curSum = 0;
    	for (int i = 1 ; i < size ; i++) {
    		curSum += prices[i] - prices[i-1];
    		if (curSum < 0) curSum = 0;
    		
    		if (max < curSum)
    			max = curSum;
    	}
        
        return max;
    }
	
	public static void main(String[] args) {
		LC0121_BestTimetoBuyandSellStock_X t = new LC0121_BestTimetoBuyandSellStock_X();
		
		System.out.println(t.maxProfit(new int[] {7,1,5,3,6,4} ));
		System.out.println(t.maxProfit(new int[] {7,6,4,3,1} ));
		System.out.println(t.maxProfit(new int[] {2,4,1} ));
	}
}
