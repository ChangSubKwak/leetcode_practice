package leetcode;

public class LC0765_CouplesHoldingHands {
    public int minSwapsCouples(int[] row) {
    	int ans = 0;
    	for (int i = 0 ; i < row.length ; i += 2) {
    		int x = row[i];
    		if (row[i+1] == (x^1)) continue;		// row[i] 와 row[i+1]은 커플
    		ans++;
    		// 자리 찾기
    		for (int j = i+1; j < row.length; j++) {
    			if (row[j] == (x^1)) {
    				row[j] = row[i+1];
    				row[i+1] = x^1;
    				break;
    			}
    		}
    	}
        return 0;
    }
	
	public static void main(String[] args) {
		LC0765_CouplesHoldingHands t = new LC0765_CouplesHoldingHands();
		
		System.out.println(t.minSwapsCouples(new int[]{ 0, 2, 1, 3 }));
	}
}
