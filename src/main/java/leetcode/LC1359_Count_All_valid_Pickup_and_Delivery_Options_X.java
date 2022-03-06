package leetcode;

public class LC1359_Count_All_valid_Pickup_and_Delivery_Options_X {
	public int countOrders(int n) {
		long res = 1;
		long mod = (long)1e9 + 7;
		
		for (int i = 1; i <= n; i++) {
			res = res * (i * 2 - 1) * i % mod;
		}
		return (int)res;
	}
}
