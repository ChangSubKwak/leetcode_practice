package leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class LC0208_Implement_Trie_Test {
    @Test
    void test() {
        LC0208_Implement_Trie.Trie test = new LC0208_Implement_Trie.Trie();
        test.insert("apple");
        Assertions.assertThat(test.search("apple")).isTrue();
        Assertions.assertThat(test.search("app")).isFalse();
        Assertions.assertThat(test.startWith("app")).isTrue();

        test.insert("app");
        Assertions.assertThat(test.search("app")).isTrue();
    }
}