package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0071_Simplify_Path_Test {

	@Test
	void test() {
		LC0071_Simplify_Path test = new LC0071_Simplify_Path();

		assertThat(test.simplifyPath("/home/")).isEqualTo("/home");
		assertThat(test.simplifyPath("/../")).isEqualTo("/");
		assertThat(test.simplifyPath("/home//foo/")).isEqualTo("/home/foo");
	}
}
