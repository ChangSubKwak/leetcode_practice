package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC1733_Minimum_Number_of_People_to_Teach_Test {
	LC1733_Minimum_Number_of_People_to_Teach test;
	
	@BeforeEach
	void setUp() {
		test = new LC1733_Minimum_Number_of_People_to_Teach();
	}
	
	@Test
	void test() {
		assertThat(test.minimumTeachings(2, new int[][]{{1}, {2}, {1, 2}}, new int[][]{{1, 2}, {1, 3}, {2, 3}})).isEqualTo(1);
		assertThat(test.minimumTeachings(3, new int[][]{{2}, {1, 3}, {1, 2}, {3}}, new int[][]{{1, 4}, {1, 2}, {3, 4}, {2, 3}})).isEqualTo(2);
	}
}
