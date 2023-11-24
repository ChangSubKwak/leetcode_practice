package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LC2391_Minimum_Amount_of_Time_to_Collect_Garbage_Test {
    @Test
    void exampleTest() {
        LC2391_Minimum_Amount_of_Time_to_Collect_Garbage  test = new LC2391_Minimum_Amount_of_Time_to_Collect_Garbage();
        
        assertThat(test.garbageCollection(
            new String[]{"G", "P", "GP", "GG"},
            new int[]{2, 4, 3}
        )).isEqualTo(21);
        
        assertThat(test.garbageCollection(
            new String[]{"MMM", "PGM", "GP"},
            new int[]{3, 10}
        )).isEqualTo(37);
    }
}
