package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC1593_Split_a_String_Into_the_Max_Number_of_Unique_Strings_Test {

	@Test
	void test() {
		LC1593_Split_a_String_Into_the_Max_Number_of_Unique_Strings test = new LC1593_Split_a_String_Into_the_Max_Number_of_Unique_Strings();

		assertThat(test.maxUniqueSplit("ababccc")).isEqualTo(5);
		assertThat(test.maxUniqueSplit("aba")).isEqualTo(2);
		assertThat(test.maxUniqueSplit("aa")).isEqualTo(1);
	}
}
