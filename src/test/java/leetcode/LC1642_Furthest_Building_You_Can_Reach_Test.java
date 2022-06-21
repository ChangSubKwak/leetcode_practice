package leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class LC1642_Furthest_Building_You_Can_Reach_Test {
    LC1642_Furthest_Building_You_Can_Reach test;
    
    @BeforeEach
    void setUp() {
        test = new LC1642_Furthest_Building_You_Can_Reach();
    }
    
    @Test
    void test() {
        Assertions.assertThat(test.furthestBuilding(new int[] {4, 2, 7, 6, 9, 14, 12}, 5, 1)).isEqualTo(4);
        Assertions.assertThat(test.furthestBuilding(new int[] {4, 12, 2, 7, 3, 18, 20, 3, 19}, 10, 2)).isEqualTo(7);
        Assertions.assertThat(test.furthestBuilding(new int[] {14, 3, 19, 3}, 5, 1)).isEqualTo(3);
    }
}
