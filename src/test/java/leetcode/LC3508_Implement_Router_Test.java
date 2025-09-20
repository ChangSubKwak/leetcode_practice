package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC3508_Implement_Router_Test {
	@Test
	void test() {
		LC3508_Implement_Router.Router test = new LC3508_Implement_Router.Router(3);

		test.addPacket(1, 4, 90);
		test.addPacket(2, 5, 90);
		test.addPacket(1, 4, 90);
		test.addPacket(3, 5, 95);
		test.addPacket(4, 5, 105);

		int[] result = test.forwardPacket();
		assertThat(result[0]).isEqualTo(2);
		assertThat(result[1]).isEqualTo(5);
		assertThat(result[2]).isEqualTo(90);

		test.addPacket(5, 2, 110);
		assertThat(test.getCount(5, 100, 110)).isEqualTo(1);
	}

	@Test
	void test2() {
		LC3508_Implement_Router.Router test = new LC3508_Implement_Router.Router(2);

		test.addPacket(7, 4, 90);

		int[] result = test.forwardPacket();
		assertThat(result[0]).isEqualTo(7);
		assertThat(result[1]).isEqualTo(4);
		assertThat(result[2]).isEqualTo(90);

		result = test.forwardPacket();
		assertThat(result).isNull();
	}
}
