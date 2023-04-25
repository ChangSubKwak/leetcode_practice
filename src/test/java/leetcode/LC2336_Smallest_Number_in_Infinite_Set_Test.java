package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class LC2336_Smallest_Number_in_Infinite_Set_Test {
    LC2336_Smallest_Number_in_Infinite_Set.SmallestInfiniteSet test = new LC2336_Smallest_Number_in_Infinite_Set.SmallestInfiniteSet();

    @Test
    void exampleTest() {
        test.addBack(2);
        assertThat(test.popSmallest()).isEqualTo(1);
        assertThat(test.popSmallest()).isEqualTo(2);
        assertThat(test.popSmallest()).isEqualTo(3);

        test.addBack(1);
        assertThat(test.popSmallest()).isEqualTo(1);
        assertThat(test.popSmallest()).isEqualTo(4);
        assertThat(test.popSmallest()).isEqualTo(5);
    }
}
