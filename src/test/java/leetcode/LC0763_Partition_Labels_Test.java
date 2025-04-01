package leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0763_Partition_Labels_Test {
	@Test
	void test() {
		LC0763_Partition_Labels test = new LC0763_Partition_Labels();

		assertThat(test.partitionLabels("ababcbacadefegdehijhklij")).isEqualTo(Arrays.asList(9, 7, 8));
		assertThat(test.partitionLabels("eccbbbbdec")).isEqualTo(Arrays.asList(10));
	}
}
