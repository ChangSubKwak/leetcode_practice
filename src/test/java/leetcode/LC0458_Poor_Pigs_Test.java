package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0458_Poor_Pigs_Test {

    @Test
    void test() {
        LC0458_Poor_Pigs test = new LC0458_Poor_Pigs();

        assertThat(test.poorPigs(4, 15, 15)).isEqualTo(2);
        assertThat(test.poorPigs(4, 15, 30)).isEqualTo(2);
    }
}
