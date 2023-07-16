package leetcode;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class LC1125_Smallest_Sufficient_Team_Test {
    @Test
    void test() {
        LC1125_Smallest_Sufficient_Team test = new LC1125_Smallest_Sufficient_Team();
        assertThat(test.smallestSufficientTeam(new String[]{"java", "nodejs", "reactjs"},
            Arrays.asList(
                Arrays.asList("java"),
                Arrays.asList("nodejs"),
                Arrays.asList("nodejs", "reactjs")
            )
        )).isEqualTo(new int[]{0, 2});

        assertThat(test.smallestSufficientTeam(new String[]{"algorithms", "math", "java", "reactjs", "csharp", "aws"},
            Arrays.asList(
                Arrays.asList("algorithms", "math", "java"),
                Arrays.asList("algorithms", "math", "reactjs"),
                Arrays.asList("java", "csharp", "aws"),
                Arrays.asList("reactjs", "csharp"),
                Arrays.asList("csharp", "math"),
                Arrays.asList("aws", "java")
            )
        )).isEqualTo(new int[]{1, 2});
    }
}
