package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class LC1539_Kth_Missing_Positive_Number_Test {

	@Test
	void test() {
		LC1539_Kth_Missing_Positive_Number test = new LC1539_Kth_Missing_Positive_Number();
		assertThat(test.findKthPositive(new int[]{2, 3, 4, 7, 11}, 5)).isEqualTo(9);
		assertThat(test.findKthPositive(new int[]{2, 3, 4, 7, 11}, 5)).isEqualTo(9);
	}
}
