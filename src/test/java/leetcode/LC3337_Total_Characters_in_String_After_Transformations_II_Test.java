package leetcode;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.assertj.core.api.Assertions.assertThat;

public class LC3337_Total_Characters_in_String_After_Transformations_II_Test {
    @Test
    void test() {
        LC3335_Total_Characters_in_String_After_Transformations_II test = new LC3335_Total_Characters_in_String_After_Transformations_II();

        assertThat(test.lengthAfterTransformations(
            "abcyy",
            2,
            Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2)
        )).isEqualTo(7);

        assertThat(test.lengthAfterTransformations(
            "azbk",
            1,
            Arrays.asList(2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2)
        )).isEqualTo(8);
    }
}
