package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC1534_Count_Good_Triplets_Test {

	@Test
	void test1() {
		LC1534_Count_Good_Triplets test = new LC1534_Count_Good_Triplets();

		assertThat(test.countGoodTriplets(new int[]{3, 0, 1, 1, 9, 7}, 7, 2, 3)).isEqualTo(4);
		assertThat(test.countGoodTriplets(new int[]{1, 1, 2, 2, 3}, 0, 0, 1)).isEqualTo(0);
	}
}
