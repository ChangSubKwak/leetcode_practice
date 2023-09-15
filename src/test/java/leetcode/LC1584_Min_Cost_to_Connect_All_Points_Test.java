package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class LC1584_Min_Cost_to_Connect_All_Points_Test {

	@Test
	void test() {
		LC1584_Min_Cost_to_Connect_All_Points test = new LC1584_Min_Cost_to_Connect_All_Points();
		assertThat(test.minCostConnectPoints(new int[][]{{0, 0}, {2, 2}, {3, 10}, {5, 2}, {7, 0}})).isEqualTo(20);
		assertThat(test.minCostConnectPoints(new int[][]{{3, 12}, {-2, 5}, {-4, 1}})).isEqualTo(18);
	}
}
