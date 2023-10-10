package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class LC1512_Number_of_Good_Pairs_Test {

	@Test
	void test() {
		LC1512_Number_of_Good_Pairs test = new LC1512_Number_of_Good_Pairs();
		assertThat(test.numIdenticalPairs(new int[]{1, 2, 3, 1, 1, 3})).isEqualTo(4);
		assertThat(test.numIdenticalPairs(new int[]{1, 1, 1, 1})).isEqualTo(6);
		assertThat(test.numIdenticalPairs(new int[]{1, 2, 3})).isEqualTo(0);
	}
}
