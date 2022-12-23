package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

class LC0309_Best_Time_to_Buy_and_Sell_Stock_with_Cooldown_Test {
	@Test
	void test() {
		LC0309_Best_Time_to_Buy_and_Sell_Stock_with_Cooldown test = new LC0309_Best_Time_to_Buy_and_Sell_Stock_with_Cooldown();
		assertThat(test.maxProfit(new int[]{1, 2, 3, 0, 2})).isEqualTo(3);
		assertThat(test.maxProfit(new int[]{0})).isEqualTo(1);
	}
}
