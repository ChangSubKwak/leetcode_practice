package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0079_Word_Search_Test {
	@Test
	void test() {
		LC0079_Word_Search test = new LC0079_Word_Search();
		assertThat(test.exist(new char[][]{
			{'A', 'B', 'C', 'E'},
			{'S', 'F', 'C', 'S'},
			{'A', 'D', 'E', 'E'}
		}, "ABCCED")).isTrue();
		assertThat(test.exist(new char[][]{
			{'A', 'B', 'C', 'E'},
			{'S', 'F', 'C', 'S'},
			{'A', 'D', 'E', 'E'}
		}, "SEE")).isTrue();
		assertThat(test.exist(new char[][]{
			{'A', 'B', 'C', 'E'},
			{'S', 'F', 'C', 'S'},
			{'A', 'D', 'E', 'E'}
		}, "ABCB")).isFalse();
	}
}
