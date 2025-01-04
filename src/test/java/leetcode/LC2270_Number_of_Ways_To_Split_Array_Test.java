package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class LC2270_Number_of_Ways_To_Split_Array_Test {
	LC2270_Number_of_Ways_to_Split_Array test;

	@BeforeEach
	void setUp() {
		test = new LC2270_Number_of_Ways_to_Split_Array();
	}

	@Test
	void test() {
		assertThat(test.waysToSplitArray(new int[]{10, 4, -8, 7})).isEqualTo(2);
		assertThat(test.waysToSplitArray(new int[]{2, 3, 1, 0})).isEqualTo(2);
	}
}
