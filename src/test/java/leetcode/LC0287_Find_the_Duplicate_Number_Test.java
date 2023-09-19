package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class LC0287_Find_the_Duplicate_Number_Test {

	@Test
	void test() {
		LC0287_Find_the_Duplicate_Number test = new LC0287_Find_the_Duplicate_Number();
		assertThat(test.findDuplicate(new int[]{1, 3, 4, 2, 2})).isEqualTo(2);
		assertThat(test.findDuplicate(new int[]{3, 1, 3, 4, 2})).isEqualTo(3);
	}
}
