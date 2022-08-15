package leetcode;

import static org.assertj.core.api.Assertions.*;

import java.util.*;
import java.util.stream.*;

import org.junit.jupiter.api.*;

class LC0121_Best_Time_to_Buy_and_Sell_Stock_Test {
    LC0121_Best_Time_to_Buy_and_Sell_Stock test;
    
    @BeforeEach
    void setUp() {
        test = new LC0121_Best_Time_to_Buy_and_Sell_Stock();
    }
    
    @Test
    void minimumTotal() {
        assertThat(test.maxProfit(new int[]{7, 1, 5, 3, 6, 4})).isEqualTo(5);
        assertThat(test.maxProfit(new int[]{7, 6, 4, 3, 1})).isEqualTo(0);
        assertThat(test.maxProfit(new int[]{2, 4, 1})).isEqualTo(2);
    }
}