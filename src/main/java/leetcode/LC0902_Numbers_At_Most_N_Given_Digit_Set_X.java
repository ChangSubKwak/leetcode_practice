package leetcode;

public class LC0902_Numbers_At_Most_N_Given_Digit_Set_X {
    public int atMostNGivenDigitSet(String[] digits, int n) {
        String number = String.valueOf(n);
        int length = number.length();
        int[] dp = new int[length + 1];
        dp[length] = 1;
        
        System.out.println("number : " + number);
        
        for (int i = length - 1; i >= 0; i--) {
            int numberAtIndex = number.charAt(i) - '0';
            for (int j = 0; j < digits.length; j++) {
                if        (Integer.valueOf(digits[j]) <  numberAtIndex) {
                    dp[i] += Math.pow(digits.length, length - i - 1);
                } else if (Integer.valueOf(digits[j]) == numberAtIndex) {
                    dp[i] += dp[i + 1];
                }
            }
        }
        
        for (int i = 1; i < length; i++) {
            dp[0] += Math.pow(digits.length, i);
        }
        return dp[0];
    }
}
