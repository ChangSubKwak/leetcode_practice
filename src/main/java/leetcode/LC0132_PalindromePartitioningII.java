package leetcode;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0132_PalindromePartitioningII {
    public int minCut(String s) {
            
        int length = s.length();
        int[] minimumCuttingCount = new int[length + 1]; 
        for (int i = 0; i <= length; i++) {
        	minimumCuttingCount[i] = i - 1;
        }
        
        return 0;
    }
	
	public static void main(String[] args) {
		LC0132_PalindromePartitioningII t = new LC0132_PalindromePartitioningII();
		assertThat(t.minCut("abb")).isEqualTo(1);
		assertThat(t.minCut("a")).isEqualTo(0);
		assertThat(t.minCut("ab")).isEqualTo(1);
		
	}
}
