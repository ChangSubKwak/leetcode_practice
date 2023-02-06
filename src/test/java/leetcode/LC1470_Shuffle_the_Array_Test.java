package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC1470_Shuffle_the_Array_Test {
	@Test
	void test1() {
		LC1470_Shuffle_the_Array test = new LC1470_Shuffle_the_Array();
		assertThat(test.shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3)).isEqualTo(new int[]{2, 3, 5, 4, 1, 7});
		assertThat(test.shuffle(new int[]{1, 2, 3, 4, 4, 3, 2, 1}, 4)).isEqualTo(new int[]{1, 4, 2, 3, 3, 2, 4, 1});
		assertThat(test.shuffle(new int[]{1, 1, 2, 2}, 2)).isEqualTo(new int[]{1, 2, 1, 2});
	}
	
}

