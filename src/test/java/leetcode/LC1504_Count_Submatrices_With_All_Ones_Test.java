package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC1504_Count_Submatrices_With_All_Ones_Test {
    LC1504_Count_Submatrices_With_All_Ones test;

    @BeforeEach
    void setUp() {
        test = new LC1504_Count_Submatrices_With_All_Ones();
    }

    @Test
    void test() {
        assertThat(test.numSubmat(new int[][]{
                {1, 0, 1}
                , {1, 1, 0}
                , {1, 1, 0}
        })).isEqualTo(13);

        assertThat(test.numSubmat(new int[][]{
                {0, 1, 1, 0}
                , {0, 1, 1, 1}
                , {1, 1, 1, 0}
        })).isEqualTo(24);
    }
}