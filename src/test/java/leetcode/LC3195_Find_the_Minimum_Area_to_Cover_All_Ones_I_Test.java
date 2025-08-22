package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC3195_Find_the_Minimum_Area_to_Cover_All_Ones_I_Test {
	LC3195_Find_the_Minimum_Area_to_Cover_All_Ones_I test;
	
	@BeforeEach
	void setUp() {
		test = new LC3195_Find_the_Minimum_Area_to_Cover_All_Ones_I();
	}
	
	@Test
	void test() {
		assertThat(test.minimumArea(new int[][]{{0, 1, 0}, {1, 0, 1}})).isEqualTo(6);
		assertThat(test.minimumArea(new int[][]{{1, 0}, {0, 0}})).isEqualTo(1);
	}
}
