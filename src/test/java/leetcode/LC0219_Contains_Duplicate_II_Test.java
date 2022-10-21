package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0219_Contains_Duplicate_II_Test {
    LC0219_Contains_Duplicate_II test;
    
    @BeforeEach
    void setUp() {
        test = new LC0219_Contains_Duplicate_II();
    }
    
    @Test
    void minimumTotal() {
        assertThat(test.containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3)).isTrue();
        assertThat(test.containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1)).isTrue();
        assertThat(test.containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2)).isFalse();
    }
}
