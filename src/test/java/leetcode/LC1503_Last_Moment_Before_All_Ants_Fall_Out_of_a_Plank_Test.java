package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class LC1503_Last_Moment_Before_All_Ants_Fall_Out_of_a_Plank_Test {

	@Test
	void test() {
		LC1503_Last_Moment_Before_All_Ants_Fall_Out_of_a_Plank test = new LC1503_Last_Moment_Before_All_Ants_Fall_Out_of_a_Plank();
		assertThat(test.getLastMoment(4, new int[]{4, 3}, new int[]{0, 1})).isEqualTo(4);
		assertThat(test.getLastMoment(7, new int[]{}, new int[]{0, 1, 2, 3, 4, 5, 6, 7})).isEqualTo(7);
		assertThat(test.getLastMoment(7, new int[]{0, 1, 2, 3, 4, 5, 6, 7}, new int[]{})).isEqualTo(7);
	}
}
