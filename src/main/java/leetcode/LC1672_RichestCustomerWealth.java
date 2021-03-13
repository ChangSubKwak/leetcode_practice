package leetcode;

public class LC1672_RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int row = accounts.length;
        int col = accounts[0].length;
        
        int max = -1;
        for (int i = 0 ; i < row ; i++) {
        	int sum = 0;
        	for (int j = 0 ; j < col ; j++) sum += accounts[i][j];
        	if (max < sum)
        		max = sum;
        }
        
        return max;
    }
	

	public static void main(String[] args) {
		LC1672_RichestCustomerWealth t = new LC1672_RichestCustomerWealth();
		System.out.println(t.maximumWealth(new int[][] {{1,2,3},{3,2,1}}));
		System.out.println(t.maximumWealth(new int[][] {{1,5},{7,3},{3,5}}));
		System.out.println(t.maximumWealth(new int[][] {{2,8,7},{7,1,3},{1,9,5}}));
	}

}
