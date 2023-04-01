package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

public class LC0704_Binary_Search_Test {
	@Test
	void test() {
		LC0704_Binary_Search test = new LC0704_Binary_Search();
		assertThat(test.search(new int[]{-1, 0, 3, 5, 9, 12}, 9)).isEqualTo(4);
		assertThat(test.search(new int[]{-1, 0, 3, 5, 9, 12}, 2)).isEqualTo(-1);
	}
}
