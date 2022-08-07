package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.*;

class LC1220_Count_Vowels_Permutation_Test {
    
    private LC1220_Count_Vowels_Permutation test;
    
    @BeforeEach
    void setUp() {
        test = new LC1220_Count_Vowels_Permutation();
    }
    
    @Test
    void test() {
        assertThat(test.countVowelPermutation(1)).isEqualTo(5);
        assertThat(test.countVowelPermutation(2)).isEqualTo(10);
        assertThat(test.countVowelPermutation(5)).isEqualTo(68);
    }
}
