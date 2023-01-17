package leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0057_Insert_Interval_Test {

	@Test
	void test() {
		LC0057_Insert_Interval test = new LC0057_Insert_Interval();
		assertThat(test.insert(new int[][]{{1, 3}, {6, 9}}, new int[]{2, 5})).isEqualTo(
			new int[][]{{1, 5}, {6, 9}}
		);
		assertThat(test.insert(new int[][]{{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}}, new int[]{4, 8})).isEqualTo(
			new int[][]{{1, 2}, {3, 10}, {12, 16}}
		);

	}
}
