package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC2872_Maximum_Number_of_K_Divisible_Components_Test {
    @Test
    void test() {
        LC2872_Maximum_Number_of_K_Divisible_Components test = new LC2872_Maximum_Number_of_K_Divisible_Components();

        assertThat(test.maxKDivisibleComponents(
            5,
            new int[][]{
                {0, 2}, {1, 2}, {1, 3}, {2, 4}
            },
            new int[]{1, 8, 1, 4, 4},
            6
        )).isEqualTo(2);

        assertThat(test.maxKDivisibleComponents(
                7,
                new int[][]{
                    {0, 1}, {0, 2}, {1, 3}, {1, 4}, {2, 5}, {2, 6}
                },
                new int[]{3, 0, 6, 1, 5, 2, 1},
                3
        )).isEqualTo(3);
    }
}
