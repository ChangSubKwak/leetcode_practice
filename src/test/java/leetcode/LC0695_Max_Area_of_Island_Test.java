package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0695_Max_Area_of_Island_Test {
	LC0695_Max_Area_of_Island test;
	
	@BeforeEach
	void setUp() {
		test = new LC0695_Max_Area_of_Island();
	}
	
	@Test
	void test() {
		assertThat(test.maxAreaOfIsland(new int[][] {
			{0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0 ,0 ,0},
			{0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0 ,0 ,0},
			{0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0 ,0 ,0},
			{0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1 ,0 ,0},
			{0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1 ,0 ,0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 ,0 ,0},
			{0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0 ,0 ,0},
			{0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0 ,0 ,0}
		})).isEqualTo(6);
	}
}
