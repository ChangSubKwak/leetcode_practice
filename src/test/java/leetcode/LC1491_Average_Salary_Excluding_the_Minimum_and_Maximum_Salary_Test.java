package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class LC1491_Average_Salary_Excluding_the_Minimum_and_Maximum_Salary_Test {
	@Test
	void test() {
		LC1491_Average_Salary_Excluding_the_Minimum_and_Maximum_Salary test = new LC1491_Average_Salary_Excluding_the_Minimum_and_Maximum_Salary();
		assertThat(test.average(new int[]{4000, 3000, 1000, 2000})).isEqualTo(2500);
		assertThat(test.average(new int[]{1000, 2000, 3000})).isEqualTo(2000);
	}
}
