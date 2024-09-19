package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0241_Different_Ways_to_Add_Parentheses_Test {
	LC0241_Different_Ways_to_Add_Parentheses test;
	
	@BeforeEach
	void setUp() {
		test = new LC0241_Different_Ways_to_Add_Parentheses();
	}
	
	@Test
	void test() {
		assertThat(test.diffWaysToCompute("2-1-1")).isEqualTo(Arrays.asList(0, 2));
		assertThat(test.diffWaysToCompute("2*3-4*5")).isEqualTo(Arrays.asList(-34, -14, -10, -10, 10));
	}
}
