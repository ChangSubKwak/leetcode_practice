package leetcode;

import static org.assertj.core.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.*;

public class LC0658_Find_K_Closet_Elements_Test {
	@Test
	void test() {
		LC0658_Find_K_Closet_Elements test = new LC0658_Find_K_Closet_Elements();

		assertThat(test.findClosestElements(new int[] {1, 2, 3, 4, 5}, 4, 3)).isEqualTo(Arrays.asList(1, 2, 3, 4))
		assertThat(test.findClosestElements(new int[] {1, 2, 3, 4, 5}, 4, 1)).isEqualTo(Arrays.asList(1, 2, 3, 4))
	}
}
