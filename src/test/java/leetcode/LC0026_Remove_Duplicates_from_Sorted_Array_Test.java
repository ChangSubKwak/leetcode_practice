package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0026_Remove_Duplicates_from_Sorted_Array_Test {
	@Test
	void test() {
		LC0026_Remove_Duplicates_from_Sorted_Array test = new LC0026_Remove_Duplicates_from_Sorted_Array();
		assertThat(test.removeDuplicates(new int[]{1, 1, 2})).isEqualTo(2);
		assertThat(test.removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4})).isEqualTo(5);
	}
}
