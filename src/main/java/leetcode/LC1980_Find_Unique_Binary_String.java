package leetcode;

import java.util.HashSet;
import java.util.Set;

public class LC1980_Find_Unique_Binary_String {
    public String findDifferentBinaryString(String[] nums) {
        int digit = nums[0].length();
        int countOfDigit = (int)Math.pow(2, digit);
        Set<Integer> set = new HashSet<>();
        
        for (int i = 0; i < countOfDigit; i++) {
            set.add(i);
        }
        
        String middleResult = "";
        for (int i = 0; i < nums.length; i++) {
            int num = Integer.parseInt(nums[i], 2);
            if (!set.contains(num)) {
                middleResult = Integer.toBinaryString(num);
                break;
            }
            set.remove(num);
        }
        
        if (middleResult.length() == 0) {
            middleResult = Integer.toBinaryString(set.stream().findFirst().get());
        }
        
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < digit - middleResult.length(); i++) {
            result.append("0");
        }
        result.append(middleResult);
        
        return result.toString();
    }
}
