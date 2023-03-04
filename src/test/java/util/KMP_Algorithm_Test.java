package util;

import static org.assertj.core.api.Assertions.*;

import java.util.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.*;

class KMP_Algorithm_Test {
    @Test
    void testPi() {
        KMP_Algorithm kmpAlgorithm = new KMP_Algorithm();
        assertThat(kmpAlgorithm.getPi("ABAABAB")).isEqualTo(Arrays.asList(0, 0, 1, 1, 2, 3, 2));
        assertThat(kmpAlgorithm.getPi("AABAA")).isEqualTo(Arrays.asList(0, 1, 0, 1, 2));
    }

    @Test
    void testStrStr() {
        KMP_Algorithm kmpAlgorithm = new KMP_Algorithm();

        assertThat(kmpAlgorithm.strStr("AAAABBBBCCCC", "AAAA")).isEqualTo(0);
        assertThat(kmpAlgorithm.strStr("AAAABBBBCCCC", "BBBB")).isEqualTo(4);
        assertThat(kmpAlgorithm.strStr("AAAABBBBCCCC", "CCCC")).isEqualTo(8);
        assertThat(kmpAlgorithm.strStr("AAAABBBBCCCC", "AACB")).isEqualTo(-1);
    }
}
