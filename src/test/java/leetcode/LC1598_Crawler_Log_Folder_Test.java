package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC1598_Crawler_Log_Folder_Test {

	@Test
	void test() {
		LC1598_Crawler_Log_Folder test = new LC1598_Crawler_Log_Folder();

		assertThat(test.minOperations(new String[]{"d1/", "d2/", "../", "d21/", "./"})).isEqualTo(2);
		assertThat(test.minOperations(new String[]{"d1/","d2/","./","d3/","../","d31/"})).isEqualTo(3);
		assertThat(test.minOperations(new String[]{"d1/", "../", "../", "../"})).isEqualTo(0);
	}
}
