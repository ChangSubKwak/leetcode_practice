package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

public class LC0013_Roman_to_Integer_Test {
	LC0013_Roman_to_Integer test;
	
	@BeforeEach
	void setUp() {
		test = new LC0013_Roman_to_Integer();
	}
	
	@Test
	void test() {
		assertThat(test.romanToInt("III")).isEqualTo(3);
		assertThat(test.romanToInt("LVIII")).isEqualTo(58);
		assertThat(test.romanToInt("MCMXCIV")).isEqualTo(1994);
	}
}
