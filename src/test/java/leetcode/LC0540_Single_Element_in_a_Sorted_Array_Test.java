package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0540_Single_Element_in_a_Sorted_Array_Test {
	@Test
	void test() {
		LC0540_Single_Element_in_a_Sorted_Array test = new LC0540_Single_Element_in_a_Sorted_Array();
		assertThat(test.singleNonDuplicate(new int[]{1, 1, 2, 3, 3, 4, 4, 8, 8})).isEqualTo(2);
		assertThat(test.singleNonDuplicate(new int[]{3, 3, 7, 7, 10, 11, 11})).isEqualTo(10);
	}
}
