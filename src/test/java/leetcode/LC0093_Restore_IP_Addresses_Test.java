package leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class LC0093_Restore_IP_Addresses_Test {
	@Test
	void test() {
		LC0093_Restore_IP_Addresses test = new LC0093_Restore_IP_Addresses();
		Assertions.assertThat(test.restoreIpAddresses("25525511135")).isEqualTo(Arrays.asList("255.255.11.135","255.255.111.35"));
		Assertions.assertThat(test.restoreIpAddresses("0000")).isEqualTo(Arrays.asList("0.0.0.0"));
		Assertions.assertThat(test.restoreIpAddresses("101023")).isEqualTo(Arrays.asList("1.0.10.23","1.0.102.3","10.1.0.23","10.10.2.3","101.0.2.3"));
	}
}
