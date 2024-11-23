package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LC1861_Rotating_the_Box_Test {
    @Test
    void exampleTest() {
        LC1861_Rotating_the_Box test = new LC1861_Rotating_the_Box();
        
        assertThat(test.rotateTheBox(new char[][]{
            {'#', '.', '#'}
        })).isEqualTo(new char[][]{
            {'#'},
            {'.'},
            {'#'}
        });
    }
}
