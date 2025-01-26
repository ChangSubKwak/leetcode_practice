package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0802_Find_Eventual_Safe_States_Test {
    
    @Test
    void test() {
        LC0802_Find_Eventual_Safe_States test = new LC0802_Find_Eventual_Safe_States();

        assertThat(test.eventualSafeNodes(new int[][]{
                {1, 2}, {2, 3}, {5}, {0}, {5}, {}, {}
        })).isEqualTo(Arrays.asList(2, 4, 5, 6));

        assertThat(test.eventualSafeNodes(new int[][]{
                {1, 2, 3, 4}, {1, 2}, {3, 4}, {0, 4}, {}
        })).isEqualTo(Arrays.asList(4));
    }
}
