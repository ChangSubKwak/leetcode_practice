package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0966_Vowel_Spellchecker_Test {
    LC0966_Vowel_Spellchecker test;
    
    @BeforeEach
    void setUp() {
        test = new LC0966_Vowel_Spellchecker();
    }
    
    @Test
    void test() {
        assertThat(test.spellchecker(
                new String[]{"KiTe", "kite", "hare", "Hare"},
                new String[]{"kite", "Kite", "KiTe", "Hare", "HARE", "Hear", "hear", "keti", "keet", "keto"}
        )).isEqualTo(new String[]{"kite", "KiTe", "KiTe", "Hare", "hare", "", "", "KiTe", "", "KiTe"});

        assertThat(test.spellchecker(
                new String[]{"yellow"}, new String[]{"YellOw"}
        )).isEqualTo(new String[]{"yellow"});
    }
}
