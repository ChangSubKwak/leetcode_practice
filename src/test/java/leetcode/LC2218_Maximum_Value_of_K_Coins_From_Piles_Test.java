package leetcode;

import static org.assertj.core.api.Assertions.*;

import java.util.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.*;

public class LC2218_Maximum_Value_of_K_Coins_From_Piles_Test {
    @Test
    void exampleTest() {
        LC2218_Maximum_Value_of_K_Coins_From_Piles test = new LC2218_Maximum_Value_of_K_Coins_From_Piles();
        assertThat(Arrays.asList(
            Arrays.asList(1, 100, 3),
            Arrays.asList(7, 8, 9)
        ), 2).isEqualTo(101);

        assertThat(Arrays.asList(
            Arrays.asList(100),
            Arrays.asList(100),
            Arrays.asList(100),
            Arrays.asList(100),
            Arrays.asList(100),
            Arrays.asList(100),
            Arrays.asList(1, 1, 1, 1, 1, 1, 100)
        ), 7).isEqualTo(706);
    }
}
