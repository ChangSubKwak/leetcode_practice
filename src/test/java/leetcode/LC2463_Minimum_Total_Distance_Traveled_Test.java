package leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class LC2463_Minimum_Total_Distance_Traveled_Test {

    @Test
    void test() {
        LC2463_Minimum_Total_Distance_Traveled test = new LC2463_Minimum_Total_Distance_Traveled();

        assertThat(test.minimumTotalDistance(Arrays.asList(0, 4, 6), new int[][]{
            {2, 2}, {6, 2}
        })).isEqualTo(4);

        assertThat(test.minimumTotalDistance(Arrays.asList(1, -1), new int[][]{
                {-2, 1}, {2, 1}
        })).isEqualTo(2);
    }
}
