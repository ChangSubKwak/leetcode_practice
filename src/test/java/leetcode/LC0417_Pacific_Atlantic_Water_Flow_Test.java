package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0417_Pacific_Atlantic_Water_Flow_Test {
    LC0417_Pacific_Atlantic_Water_Flow test;
    
    @BeforeEach
    void setUp() {
        test = new LC0417_Pacific_Atlantic_Water_Flow();
    }
    
    @Test
    void minimumTotal() {
        assertThat(test.pacificAtlantic(new int[][] {
            {1, 2, 2, 3, 5},
            {3, 2, 3, 4, 4},
            {2, 4, 5, 3, 1},
            {6, 7, 1, 4, 5},
            {5, 1, 1, 2, 4}
        })).isEqualTo(Arrays.asList(
            Arrays.asList(0, 4),
            Arrays.asList(1, 3),
            Arrays.asList(1, 4),
            Arrays.asList(2, 2),
            Arrays.asList(3, 0),
            Arrays.asList(3, 1),
            Arrays.asList(4, 0)
            )
        );

        assertThat(test.pacificAtlantic(new int[][] {
            {0}
        })).isEqualTo(Arrays.asList(
            Arrays.asList(0 ,0)
            )
        );
    }
}
