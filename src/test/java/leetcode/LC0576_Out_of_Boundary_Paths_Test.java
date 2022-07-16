package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

public class LC0576_Out_of_Boundary_Paths_Test {
	LC0576_Out_of_Boundary_Paths test;
	
	@BeforeEach
	void setUp() {
		test = new LC0576_Out_of_Boundary_Paths();
	}
	
	@Test
	void test() {
		assertThat(test.findPaths(2, 2, 2, 0, 0)).isEqualTo(6);
		assertThat(test.findPaths(1, 3, 3, 0, 1)).isEqualTo(12);
	}
}
