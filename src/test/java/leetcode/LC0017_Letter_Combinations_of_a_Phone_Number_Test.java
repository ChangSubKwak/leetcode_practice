package leetcode;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class LC0017_Letter_Combinations_of_a_Phone_Number_Test {
	@Test
	void test() {
		LC0017_Letter_Combinations_of_a_Phone_Number test = new LC0017_Letter_Combinations_of_a_Phone_Number();
		assertThat(test.letterCombinations("23")).isEqualTo(Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"));
		assertThat(test.letterCombinations("")).isEqualTo(Arrays.asList(""));
		assertThat(test.letterCombinations("2")).isEqualTo(Arrays.asList("a", "b", "c"));
	}
}
