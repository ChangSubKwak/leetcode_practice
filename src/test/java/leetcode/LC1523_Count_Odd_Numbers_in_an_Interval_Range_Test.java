package leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC1523_Count_Odd_Numbers_in_an_Interval_Range_Test {

	@Test
	void test() {
		LC1523_Count_Odd_Numbers_in_an_Interval_Range test = new LC1523_Count_Odd_Numbers_in_an_Interval_Range();
		Assertions.assertThat(test.countOdds(3, 7)).isEqualTo(3);
		Assertions.assertThat(test.countOdds(8, 10)).isEqualTo(1);
	}
}
