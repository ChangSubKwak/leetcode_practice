package leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LC3024_Type_of_Triangle {
    public String triangleType(int[] nums) {
        Arrays.sort(nums);
        if (nums[0] + nums[1] <= nums[2]) {
            return "none";
        }

        if (nums[0] == nums[1] && nums[1] == nums[2]) {
            return "equilateral";
        }

        List<Integer> numsList = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toList());

        if (numsList.contains(nums[0] ^ nums[1] ^ nums[2])) {
            return "isosceles";
        }

        return "scalene";
    }
}
