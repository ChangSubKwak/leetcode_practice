package leetcode;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class LC2338_Count_the_Number_of_Ideal_Arrays_Test {

    @Test
    void exampleTest() {
        LC2338_Count_the_Number_of_Ideal_Arrays test = new LC2338_Count_the_Number_of_Ideal_Arrays();

        assertThat(test.idealArrays(2, 5)).isEqualTo(10);
        assertThat(test.idealArrays(5, 3)).isEqualTo(11);
    }
}
