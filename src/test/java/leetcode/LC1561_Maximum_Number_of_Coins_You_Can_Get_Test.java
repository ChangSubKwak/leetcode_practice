package leetcode;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class LC1561_Maximum_Number_of_Coins_You_Can_Get_Test {

	@Test
	void test() {
		LC1561_Maximum_Number_of_Coins_You_Can_Get test = new LC1561_Maximum_Number_of_Coins_You_Can_Get();
		assertThat(test.maxCoins(new int[]{2, 4, 1, 2, 7, 8})).isEqualTo(9);
		assertThat(test.maxCoins(new int[]{2, 4, 5})).isEqualTo(4);
		assertThat(test.maxCoins(new int[]{9, 8, 7, 6, 5, 1, 2, 3, 4})).isEqualTo(18);
	}
}
