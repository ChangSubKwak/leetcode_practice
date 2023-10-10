package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class LC0712_Minimum_ASCII_Delete_Sum_for_Two_Strings_Test {

	@Test
	void test() {
		LC0712_Minimum_ASCII_Delete_Sum_for_Two_Strings test = new LC0712_Minimum_ASCII_Delete_Sum_for_Two_Strings();
		assertThat(test.minimumDeleteSum("sea", "eat")).isEqualTo(231);
		assertThat(test.minimumDeleteSum("delete", "leet")).isEqualTo(403);
	}
}
