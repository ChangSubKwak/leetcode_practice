package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC1472_Design_Browser_History_Test {
	@Test
	void test() {
		LC1472_Design_Browser_History.BrowserHistory test = new LC1472_Design_Browser_History.BrowserHistory("leetcode.com");

		test.visit("google.com");
		test.visit("facebook.com");
		test.visit("youtube.com");

		assertThat(test.back(1)).isEqualTo("facebook.com");
		assertThat(test.back(1)).isEqualTo("google.com");
		assertThat(test.forward(1)).isEqualTo("facebook.com");

		test.visit("linkedin.com");
		assertThat(test.forward(2)).isEqualTo("linkedin.com");
		assertThat(test.back(2)).isEqualTo("google.com");
		assertThat(test.back(7)).isEqualTo("leetcode.com");
	}
	
}

