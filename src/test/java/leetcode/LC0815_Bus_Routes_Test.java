package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LC0815_Bus_Routes_Test {
    
    @Test
    void test() {
        LC0815_Bus_Routes test = new LC0815_Bus_Routes();
        assertThat(test.numBusesToDestination(new int[][]{
            {1, 2, 7},
            {3, 6, 7}
        }, 1, 6)).isEqualTo(2);

        assertThat(test.numBusesToDestination(new int[][]{
            {7, 12},
            {4, 5, 15},
            {6},
            {15, 19},
            {9, 12, 13}
        }, 1, 6)).isEqualTo(-1);
    }
}
