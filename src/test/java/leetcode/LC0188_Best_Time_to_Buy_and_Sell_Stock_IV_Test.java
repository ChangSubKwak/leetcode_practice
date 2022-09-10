package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

class LC0188_Best_Time_to_Buy_and_Sell_Stock_IV_Test {
    LC0188_Best_Time_to_Buy_and_Sell_Stock_IV_X test;
    
    @BeforeEach
    void setUp() {
        test = new LC0188_Best_Time_to_Buy_and_Sell_Stock_IV_X();
    }
    
    @Test
    void test() {
        assertThat(test.maxProfit(2, new int[] { 2, 4, 1 })).isEqualTo(2);
        assertThat(test.maxProfit(2, new int[] { 3, 2, 6, 5, 0, 3 })).isEqualTo(7);
    }
}