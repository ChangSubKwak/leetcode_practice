package main.java.leetcode;

public class LC1663_SmallestStringWithAGivenNumericValue {
    public String getSmallestString(int n, int k) {
    	//int remain = k;
    	StringBuilder sb = new StringBuilder();
    	while(k != 0) {
    		for (int i = 26; i>=1 ;i--) {
    			if (k - i < n - 1) continue;
    			
    			sb.append((char)('a' + i - 1));
    			k -= i;
    			break;
    		}
    		n--;
    	}
        return sb.reverse().toString();
    } 
	

	public static void main(String[] args) {
		LC1663_SmallestStringWithAGivenNumericValue t = new LC1663_SmallestStringWithAGivenNumericValue();
		System.out.println(t.getSmallestString(3, 27));
		System.out.println(t.getSmallestString(5, 73));
	}

}
