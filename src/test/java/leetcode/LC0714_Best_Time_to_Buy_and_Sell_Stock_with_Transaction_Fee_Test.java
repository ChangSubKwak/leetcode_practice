package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

public class LC0714_Best_Time_to_Buy_and_Sell_Stock_with_Transaction_Fee_Test {

	@Test
	void test() {
		LC0714_Best_Time_to_Buy_and_Sell_Stock_with_Transaction_Fee test = new LC0714_Best_Time_to_Buy_and_Sell_Stock_with_Transaction_Fee();
		assertThat(test.maxProfit(new int[]{1, 3, 2, 8, 4, 9}, 2)).isEqualTo(8);
		assertThat(test.maxProfit(new int[]{1, 3, 7, 5, 10, 3}, 3)).isEqualTo(6);
	}
}
