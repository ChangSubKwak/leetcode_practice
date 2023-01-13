package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC1519_Number_of_Nodes_in_the_SubTree_With_the_Same_Label_Test {

	@Test
	void test() {
		LC1519_Number_of_Nodes_in_the_SubTree_With_the_Same_Label test = new LC1519_Number_of_Nodes_in_the_SubTree_With_the_Same_Label();
		assertThat(test.countSubTrees(7, new int[][]{{0, 1}, {0, 2}, {1, 4}, {1, 5}, {2, 3}, {2, 6}}, "abaedcd"))
			.isEqualTo(new int[]{2, 1, 1, 1, 1, 1, 1});
		assertThat(test.countSubTrees(4, new int[][]{{0, 1}, {0, 2}, {0, 3}}, "bbbb"))
			.isEqualTo(new int[]{4, 2, 1, 1});
		assertThat(test.countSubTrees(5, new int[][]{{0, 1}, {0, 2}, {1, 3}, {0, 4}}, "aabab"))
			.isEqualTo(new int[]{3, 2, 1, 1, 1});
	}
}
