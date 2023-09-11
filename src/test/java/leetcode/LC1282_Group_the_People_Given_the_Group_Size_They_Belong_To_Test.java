package leetcode;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class LC1282_Group_the_People_Given_the_Group_Size_They_Belong_To_Test {
    
    @Test
    void test() {
        LC1282_Group_the_People_Given_the_Group_Size_They_Belong_To test = new LC1282_Group_the_People_Given_the_Group_Size_They_Belong_To();
        assertThat(test.groupThePeople(new int[]{3, 3, 3, 3, 3, 1, 3})).isEqualTo(
            Arrays.asList(
                Arrays.asList(5),
                Arrays.asList(0, 1, 2),
                Arrays.asList(3, 4, 6)
            )
        );

        assertThat(test.groupThePeople(new int[]{2, 1, 3, 3, 3, 2})).isEqualTo(
            Arrays.asList(
                Arrays.asList(1),
                Arrays.asList(0, 5),
                Arrays.asList(2, 3, 4)
            )
        );
    }
}
