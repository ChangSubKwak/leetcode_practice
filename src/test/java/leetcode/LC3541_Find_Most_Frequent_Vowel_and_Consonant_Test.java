package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC3541_Find_Most_Frequent_Vowel_and_Consonant_Test {
	LC3541_Find_Most_Frequent_Vowel_and_Consonant test;
	
	@BeforeEach
	void setUp() {
		test = new LC3541_Find_Most_Frequent_Vowel_and_Consonant();
	}
	
	@Test
	void test() {
		assertThat(test.maxFreqSum("successes")).isEqualTo(6);
		assertThat(test.maxFreqSum("aeiaeia")).isEqualTo(3);
	}
}
