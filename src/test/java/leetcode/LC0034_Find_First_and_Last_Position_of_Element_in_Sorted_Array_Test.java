package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

public class LC0034_Find_First_and_Last_Position_of_Element_in_Sorted_Array_Test {
	LC0034_Find_First_and_Last_Position_of_Element_in_Sorted_Array test;
	
	@BeforeEach
	void setUp() {
		test = new LC0034_Find_First_and_Last_Position_of_Element_in_Sorted_Array();
	}
	
	@Test
	void test() {
		assertThat(test.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8)).isEqualTo(new int[]{3, 4});
		assertThat(test.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6)).isEqualTo(new int[]{-1, -1});
		assertThat(test.searchRange(new int[]{}, 0)).isEqualTo(new int[]{-1, -1});
	}
}
