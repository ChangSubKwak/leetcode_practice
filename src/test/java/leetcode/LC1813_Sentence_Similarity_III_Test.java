package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC1813_Sentence_Similarity_III_Test {
    @Test
    void test() {
        LC1813_Sentence_Similarity_III test = new LC1813_Sentence_Similarity_III();

        assertThat(test.areSentencesSimilar("My name is Haley", "My Haley")).isEqualTo(true);
        assertThat(test.areSentencesSimilar("of", "A lot of words")).isEqualTo(false);
        assertThat(test.areSentencesSimilar("Eating right now", "Eating")).isEqualTo(true);
    }
}
