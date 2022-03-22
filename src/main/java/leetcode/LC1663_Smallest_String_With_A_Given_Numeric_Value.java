package leetcode;

public class LC1663_Smallest_String_With_A_Given_Numeric_Value {
    public String getSmallestString(int n, int k) {
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
}
