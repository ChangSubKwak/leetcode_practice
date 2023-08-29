package leetcode;

public class LC2483_Minimum_Penalty_for_a_Shop {
    public int bestClosingTime(String customers) {
        int[] penalties = new int[customers.length() + 1];
        int length = customers.length();
        
        for (int i = length - 1; i >= 0; i--) {
            if (customers.charAt(i) == 'Y') {
                if (i == length - 1) {
                    penalties[i] = 1;
                    continue;
                }
                penalties[i] = penalties[i + 1] + 1;
            } else {
                if (i == length - 1) {
                    continue;
                }
                penalties[i] = penalties[i + 1];
            }
        }
        
        int countN = 0;
        for (int i = 0; i < length; i++) {
            if (customers.charAt(i) == 'N') {
                countN++;
            }
            penalties[i + 1] += countN;
        }
        
        int min = 100000;
        for (int i = 0; i <= length; i++) {
            min = Math.min(min, penalties[i]);
        }
        
        int minIndex = 0;
        for (int i = 0; i <= length; i++) {
            if (penalties[i] == min) {
                minIndex = i;
                break;
            }
        }
        
        return minIndex;
    }
}
