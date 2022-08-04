package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0858_Mirror_Reflection_Test {
    LC0858_Mirror_Reflection test;
    
    @BeforeEach
    void setUp() {
        test = new LC0858_Mirror_Reflection();
    }
    
    @Test
    void test() {
        assertThat(test.mirrorReflection(2, 1)).isEqualTo(2);
        assertThat(test.mirrorReflection(3, 1)).isEqualTo(1);
    }
}
