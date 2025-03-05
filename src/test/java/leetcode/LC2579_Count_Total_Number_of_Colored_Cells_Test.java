package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC2579_Count_Total_Number_of_Colored_Cells_Test {
	@Test
	void test() {
		LC2579_Count_Total_Number_of_Colored_Cells test = new LC2579_Count_Total_Number_of_Colored_Cells();

		assertThat(test.coloredCells(1)).isEqualTo(1);
		assertThat(test.coloredCells(2)).isEqualTo(5);
	}
}
