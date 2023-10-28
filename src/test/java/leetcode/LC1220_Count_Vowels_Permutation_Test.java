package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.*;

class LC1220_Count_Vowels_Permutation_Test {
    
    @Test
    void test() {
        LC1220_Count_Vowels_Permutation test = new LC1220_Count_Vowels_Permutation();
        assertThat(test.countVowelPermutation(1)).isEqualTo(5);
        assertThat(test.countVowelPermutation(2)).isEqualTo(10);
        assertThat(test.countVowelPermutation(5)).isEqualTo(68);
    }
}
