package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC3197_Find_the_Minimum_Area_to_Cover_All_Ones_II_Test {
	LC3197_Find_the_Minimum_Area_to_Cover_All_Ones_II test;
	
	@BeforeEach
	void setUp() {
		test = new LC3197_Find_the_Minimum_Area_to_Cover_All_Ones_II();
	}
	
	@Test
	void test() {
		assertThat(test.minimumSum(new int[][]{{1, 0, 1}, {1, 1, 1}})).isEqualTo(5);
		assertThat(test.minimumSum(new int[][]{{1, 0, 1, 0}, {0, 1, 0, 1}})).isEqualTo(5);
	}
}
