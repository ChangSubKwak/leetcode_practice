package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

public class LC0295_Find_Median_from_Data_Stream_Test {
	@Test
	void test() {
		LC0295_Find_Median_from_Data_Stream.MedianFinder test = new LC0295_Find_Median_from_Data_Stream.MedianFinder();
		test.addNum(1);
		test.addNum(2);
		assertThat(test.findMedian()).isEqualTo(1.5);
		test.addNum(3);
		assertThat(test.findMedian()).isEqualTo(2.0);
	}
}
