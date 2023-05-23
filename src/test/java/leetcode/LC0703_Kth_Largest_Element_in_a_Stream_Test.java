package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0703_Kth_Largest_Element_in_a_Stream_Test {
	@Test
	void test() {
		LC0703_Kth_Largest_Element_in_a_Stream.KthLargest test;

		test = new LC0703_Kth_Largest_Element_in_a_Stream.KthLargest(3, new int[]{4, 5, 8, 2});
		assertThat(test.add(3)).isEqualTo(4);
		assertThat(test.add(5)).isEqualTo(5);
		assertThat(test.add(10)).isEqualTo(5);
		assertThat(test.add(9)).isEqualTo(8);
		assertThat(test.add(4)).isEqualTo(8);
	}
}
