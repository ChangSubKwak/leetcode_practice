package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

public class LC0912_Sort_an_Array_Test {
	@Test
	void test() {
		LC0912_Sort_an_Array test = new LC0912_Sort_an_Array();
		assertThat(test.sortArray(new int[]{5, 2, 3, 1})).isEqualTo(new int[]{1, 2, 3, 5});
		assertThat(test.sortArray(new int[]{5, 1, 1, 2, 0, 0})).isEqualTo(new int[]{0, 0, 1, 1, 2, 5});
	}
}
