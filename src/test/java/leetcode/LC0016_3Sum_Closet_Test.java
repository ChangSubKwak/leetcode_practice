package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

public class LC0016_3Sum_Closet_Test {
	@Test
	void test() {
		LC0016_3Sum_Closet test = new LC0016_3Sum_Closet();
		assertThat(test.threeSumClosest(new int[]{-1, 2, 1, -4}, 1)).isEqualTo(2);
		assertThat(test.threeSumClosest(new int[]{0, 0, 0}, 1)).isEqualTo(0);
	}
}
