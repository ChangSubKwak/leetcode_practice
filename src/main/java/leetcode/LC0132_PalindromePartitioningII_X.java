package leetcode;

public class LC0132_PalindromePartitioningII_X {
    public int minCut(String s) {
        int length = s.length();
        int[] minimumCuttingCount = new int[length + 1];
        for (int i = 0; i <= length; i++) {
        	minimumCuttingCount[i] = i - 1;
        }
        
        System.out.println("length = " + length);
        for (int i = 0; i <  length; i++) {
        	for (int j = 0; i-j   >= 0 && i+j < length && s.charAt(i-j)   == s.charAt(i+j) ; j++) {
        		minimumCuttingCount[i+j+1] = Math.min(minimumCuttingCount[i+j+1], 1 + minimumCuttingCount[i-j  ]);
        	}
        	for (int j = 1; i-j+1 >= 0 && i+j < length && s.charAt(i-j+1) == s.charAt(i+j) ; j++) {
        		minimumCuttingCount[i+j+1] = Math.min(minimumCuttingCount[i+j+1], 1 + minimumCuttingCount[i-j+1]);
        	}
        }
        return minimumCuttingCount[length];
    }
}
