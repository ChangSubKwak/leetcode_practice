package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0035_Search_Insert_Position_Test {
	@Test
	void test() {
		LC0035_Search_Insert_Position test = new LC0035_Search_Insert_Position();
		assertThat(test.searchInsert(new int[]{1, 3, 5, 6}, 5)).isEqualTo(2);
		assertThat(test.searchInsert(new int[]{1, 3, 5, 6}, 2)).isEqualTo(1);
		assertThat(test.searchInsert(new int[]{1, 3, 5, 6}, 7)).isEqualTo(4);
	}
}
