package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC3042_Count_Prefix_and_Suffix_Pairs_I_Test {
    @Test
    void test() {
        LC3042_Count_Prefix_and_Suffix_Pairs_I test = new LC3042_Count_Prefix_and_Suffix_Pairs_I();

        assertThat(test.countPrefixSuffixPairs(new String[]{"a", "aba", "ababa", "aa"})).isEqualTo(4);
        assertThat(test.countPrefixSuffixPairs(new String[]{"pa", "papa", "ma", "mama"})).isEqualTo(2);
        assertThat(test.countPrefixSuffixPairs(new String[]{"abab", "ab"})).isEqualTo(0);
    }
}
