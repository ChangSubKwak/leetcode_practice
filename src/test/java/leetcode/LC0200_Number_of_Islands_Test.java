package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC0200_Number_of_Islands_Test {
    LC0200_Number_of_Islands test;
    
    @BeforeEach
    void setUp() {
        test = new LC0200_Number_of_Islands();
    }
    
    @Test
    void test() {
        assertThat(test.numIslands(new char[][] {
            {'1', '1', '1', '1', '0'},
            {'1', '1', '0', '1', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '0', '0', '0'}
            })
        ).isEqualTo(1);

        assertThat(test.numIslands(new char[][]{
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
            })
        ).isEqualTo(3);
    }
}