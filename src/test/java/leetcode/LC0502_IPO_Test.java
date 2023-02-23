package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0502_IPO_Test {
	void test() {
		LC0502_IPO test = new LC0502_IPO();
		assertThat(test.findMaximizedCapital(2, 0, new int[]{1, 2, 3}, new int[]{0, 1, 1})).isEqualTo(4);
		assertThat(test.findMaximizedCapital(3, 0, new int[]{1, 2, 3}, new int[]{0, 1, 2})).isEqualTo(6);
	}
}
