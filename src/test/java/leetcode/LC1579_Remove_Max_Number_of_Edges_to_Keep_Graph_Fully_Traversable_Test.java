package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

public class LC1579_Remove_Max_Number_of_Edges_to_Keep_Graph_Fully_Traversable_Test {

	@Test
	void test1() {
		LC1579_Remove_Max_Number_of_Edges_to_Keep_Graph_Fully_Traversable test = new LC1579_Remove_Max_Number_of_Edges_to_Keep_Graph_Fully_Traversable();
		assertThat(test.maxNumEdgesToRemove(4, new int[][]{{3, 1, 2}, {3, 2, 3}, {1, 1, 3}, {1, 2, 4}, {1, 1, 2}, {2, 3, 4}})).isEqualTo(2);
		assertThat(test.maxNumEdgesToRemove(4, new int[][]{{3, 1, 2}, {3, 2, 3}, {1, 1, 4}, {2, 1, 4}})).isEqualTo(0);
		assertThat(test.maxNumEdgesToRemove(4, new int[][]{{3, 2, 3}, {1, 1, 2}, {2, 3, 4}})).isEqualTo(-1);
	}
}
