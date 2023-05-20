package leetcode;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LC0399_Evaluate_Division_Test {
    @Test
    void test() {
        LC0399_Evaluate_Division test = new LC0399_Evaluate_Division();
        assertThat(test.calcEquation(
            Arrays.asList(
                Arrays.asList("a", "b"),
                Arrays.asList("b", "c")
            ),
            new double[] {2.0, 3.0},
            Arrays.asList(
                Arrays.asList("a", "c"),
                Arrays.asList("b", "a"),
                Arrays.asList("a", "e"),
                Arrays.asList("a", "a"),
                Arrays.asList("e", "e")
            )
        )).isEqualTo(new double[]{
            6.0, 5.0, -1.0, 1.0, -1.0
        });
    }
}
