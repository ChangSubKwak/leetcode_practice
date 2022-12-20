package leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class LC0841_Keys_and_Rooms_Test {
    
    @Test
    void test() {
        LC0841_Keys_and_Rooms test = new LC0841_Keys_and_Rooms();

        assertThat(test.canVisitAllRooms(Arrays.asList(
            Arrays.asList(1),
            Arrays.asList(2),
            Arrays.asList(3),
            Arrays.asList()
        ))).isTrue();
        assertThat(test.canVisitAllRooms(Arrays.asList(
             Arrays.asList(1, 3),
             Arrays.asList(3, 0, 1),
             Arrays.asList(2),
             Arrays.asList(0)
         ))).isFalse();
    }
}
