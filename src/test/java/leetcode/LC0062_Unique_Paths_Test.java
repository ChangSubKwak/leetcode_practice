package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0062_Unique_Paths_Test {
    LC0062_Unique_Paths test;
    
    @BeforeEach
    void setUp() {
        test = new LC0062_Unique_Paths();
    }
    
    @Test
    void test() {
        assertThat(test.uniquePaths(3, 7)).isEqualTo(28);
        assertThat(test.uniquePaths(3, 2)).isEqualTo(3);
        assertThat(test.uniquePaths(51, 9)).isEqualTo(1916797311);
    }
}
