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

        assertThat(test.calcEquation(
            Arrays.asList(
                Arrays.asList("a", "b"),
                Arrays.asList("b", "c"),
                Arrays.asList("bc", "cd")
            ),
            new double[] {1.5, 2.5, 5.0},
            Arrays.asList(
                Arrays.asList("a", "c"),
                Arrays.asList("c", "b"),
                Arrays.asList("bc", "cd"),
                Arrays.asList("cd", "bc")
            )
        )).isEqualTo(new double[]{
            3.75, 0.4, 5.0, 0.2
        });

        assertThat(test.calcEquation(
            Arrays.asList(
                Arrays.asList("a", "b")
            ),
            new double[] {0.5},
            Arrays.asList(
                Arrays.asList("a", "c"),
                Arrays.asList("b", "a"),
                Arrays.asList("a", "c"),
                Arrays.asList("x", "y")
            )
        )).isEqualTo(new double[]{
            0.5, 2.0, -1.0, -1.0
        });
    }
}
