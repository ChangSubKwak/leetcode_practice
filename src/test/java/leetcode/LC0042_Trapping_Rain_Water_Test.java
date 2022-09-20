package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

public class LC0042_Trapping_Rain_Water_Test {
	LC0042_Trapping_Rain_Water test;
	
	@BeforeEach
	void setUp() {
		test = new LC0042_Trapping_Rain_Water();
	}
	
	@Test
	void test() {
		assertThat(test.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1})).isEqualTo(6);
		assertThat(test.trap(new int[]{4, 2, 0, 3, 2, 5})).isEqualTo(9);
	}
}
