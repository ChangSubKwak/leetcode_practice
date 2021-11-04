package leetcode;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class LC0217_ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        return set.size() != nums.length;
    }

	public static void main(String[] args) {
		LC0217_ContainsDuplicate t = new LC0217_ContainsDuplicate();
		System.out.println(t.containsDuplicate(new int[] { 1, 2, 3, 1 }));		// true 
		System.out.println(t.containsDuplicate(new int[] { 1, 2, 3, 4 }));		// false
		System.out.println(t.containsDuplicate(new int[] { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 }));	// true
		
//		assertThat(t.containsDuplicate(new int[] { 1, 2, 3, 4 })).isEqualTo(false);
//		assertThat(t.containsDuplicate(new int[] { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 })).isEqualTo(true);
	}
}
