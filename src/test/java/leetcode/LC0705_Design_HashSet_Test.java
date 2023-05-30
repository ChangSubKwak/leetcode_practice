package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0705_Design_HashSet_Test {
	@Test
	void test() {
		LC0705_Design_HashSet.MyHashSet test = new LC0705_Design_HashSet.MyHashSet();
		test.add(1);
		test.add(2);
		assertThat(test.contains(1)).isTrue();
		assertThat(test.contains(3)).isFalse();

		test.add(2);
		assertThat(test.contains(2)).isTrue();

		test.remove(2);
		assertThat(test.contains(2)).isFalse();
	}
}
