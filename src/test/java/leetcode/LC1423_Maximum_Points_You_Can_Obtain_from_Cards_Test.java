package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

public class LC1423_Maximum_Points_You_Can_Obtain_from_Cards_Test {
	LC1423_Maximum_Points_You_Can_Obtain_from_Cards test;
	
	@BeforeEach
	void setUp() {
		test = new LC1423_Maximum_Points_You_Can_Obtain_from_Cards();
	}
	
	@Test
	void test() {
		assertThat(test.maxScore(new int[] { 1, 2, 3, 4, 5, 6, 1}, 3)).isEqualTo(12);
		assertThat(test.maxScore(new int[] { 2, 2, 2}, 2)).isEqualTo(4);
		assertThat(test.maxScore(new int[] { 9, 7, 7, 9, 7, 7, 9}, 7)).isEqualTo(55);
	}
}
