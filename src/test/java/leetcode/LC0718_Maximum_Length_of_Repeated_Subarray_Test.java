package leetcode;

import leetcode.LC0729_My_Calendar_I.MyCalendar;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0718_Maximum_Length_of_Repeated_Subarray_Test {
	LC0718_Maximum_Length_of_Repeated_Subarray test;
	
	@BeforeEach
	void setUp() {
		test = new LC0718_Maximum_Length_of_Repeated_Subarray();
	}
	
	@Test
	void test() {
		assertThat(test.findLength(new int[]{1, 2, 3, 2, 1}, new int[]{3, 2, 1, 4, 7})).isEqualTo(3);
		assertThat(test.findLength(new int[]{0, 0, 0, 0, 0}, new int[]{0, 0, 0, 0, 0})).isEqualTo(5);
	}
}
