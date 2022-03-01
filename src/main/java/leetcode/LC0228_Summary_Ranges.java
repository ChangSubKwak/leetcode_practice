package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC0228_Summary_Ranges {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        if (nums.length == 0) {
            return res;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nums.length - 1; i++) {
            if (i >= nums.length - 1) {
                res.add(String.valueOf(nums[i]));
                break;
            }
            
            if ((nums[i] + 1) == nums[i+1]) {
                if (sb.length() == 0) {
                    sb.append(nums[i] + "->");
                }
                continue;
            }
            
            sb.append(nums[i]);
            res.add(sb.toString());
            sb.setLength(0);
        }
        
        if (sb.length() != 0) {
            sb.append(nums[nums.length - 1]);
            res.add(sb.toString());
        } else {
            res.add(String.valueOf(nums[nums.length - 1]));
        }
        
        return res;
    }
}
