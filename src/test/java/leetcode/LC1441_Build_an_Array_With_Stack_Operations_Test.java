package leetcode;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class LC1441_Build_an_Array_With_Stack_Operations_Test {
    @Test
    void test() {
        LC1441_Build_an_Array_With_Stack_Operations test = new LC1441_Build_an_Array_With_Stack_Operations();
        assertThat(test.buildArray(new int[]{1, 3}, 3)).isEqualTo(Arrays.asList("Push", "Push", "Pop", "Push"));
        assertThat(test.buildArray(new int[]{1, 2}, 4)).isEqualTo(Arrays.asList("Push", "Push"));
    }
}
