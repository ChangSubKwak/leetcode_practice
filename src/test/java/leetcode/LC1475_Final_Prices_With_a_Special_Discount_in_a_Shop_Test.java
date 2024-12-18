package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC1475_Final_Prices_With_a_Special_Discount_in_a_Shop_Test {
	@Test
	void test1() {
		LC1475_Final_Prices_With_a_Special_Discount_in_a_Shop test = new LC1475_Final_Prices_With_a_Special_Discount_in_a_Shop();

		assertThat(test.finalPrices(new int[]{8, 4, 6, 2, 3})).isEqualTo(new int[]{4, 2, 4, 2, 3});
		assertThat(test.finalPrices(new int[]{1, 2, 3, 4, 5})).isEqualTo(new int[]{1, 2, 3, 4, 5});
		assertThat(test.finalPrices(new int[]{10, 1, 1, 6})).isEqualTo(new int[]{10, 1, 1, 6});
	}
}
