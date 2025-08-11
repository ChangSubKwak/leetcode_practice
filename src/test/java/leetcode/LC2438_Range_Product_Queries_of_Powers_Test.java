package leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class LC2438_Range_Product_Queries_of_Powers_Test {

    @Test
    void test() {
        LC2438_Range_Product_Queries_of_Powers test = new LC2438_Range_Product_Queries_of_Powers();

        Assertions.assertThat(test.productQueries(15, new int[][]{{0, 1}, {2, 2}, {0, 3}})).isEqualTo(new int[]{2, 4, 64});
        Assertions.assertThat(test.productQueries(2, new int[][]{{0, 0}})).isEqualTo(new int[]{2});
    }
}
