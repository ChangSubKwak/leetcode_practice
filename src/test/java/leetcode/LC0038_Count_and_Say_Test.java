package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

public class LC0038_Count_and_Say_Test {
	@Test
	void test() {
		LC0038_Count_and_Say test = new LC0038_Count_and_Say();
		assertThat(test.countAndSay(1)).isEqualTo("1");
		assertThat(test.countAndSay(4)).isEqualTo("1211");
	}
}
