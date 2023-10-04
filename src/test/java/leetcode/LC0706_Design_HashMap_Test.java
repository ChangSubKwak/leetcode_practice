package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0706_Design_HashMap_Test {
	@Test
	void test() {
		LC0706_Design_HashMap.MyHashMap test = new LC0706_Design_HashMap.MyHashMap();
		test.put(1, 1);
		test.put(2, 2);
		assertThat(test.get(1)).isEqualTo(1);
		assertThat(test.get(3)).isEqualTo(-1);

		test.put(2, 1);
		assertThat(test.get(2)).isEqualTo(1);

		test.remove(2);
		assertThat(test.get(2)).isEqualTo(-1);
	}
}
