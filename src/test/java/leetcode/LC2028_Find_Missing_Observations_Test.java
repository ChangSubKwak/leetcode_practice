package leetcode;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class LC2028_Find_Missing_Observations_Test {
    @Test
    void exampleTest() {
        LC2028_Find_Missing_Observations test = new LC2028_Find_Missing_Observations();

        assertThat(test.missingRolls(new int[]{3, 2, 4, 3}, 4, 2)).isEqualTo(new int[]{6, 6});
        assertThat(test.missingRolls(new int[]{3, 2, 4, 3}, 3, 4)).isEqualTo(new int[]{2, 3, 2, 2});
        assertThat(test.missingRolls(new int[]{3, 2, 4, 3}, 6, 4)).isEqualTo(new int[]{});
    }
}
