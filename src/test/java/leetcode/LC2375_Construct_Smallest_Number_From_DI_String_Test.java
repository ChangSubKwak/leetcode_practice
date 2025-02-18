package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC2375_Construct_Smallest_Number_From_DI_String_Test {
    @Test
    void exampleTest() {
        LC2375_Construct_Smallest_Number_From_DI_String test = new LC2375_Construct_Smallest_Number_From_DI_String();

        assertThat(test.smallestNumber("IIIDIDDD")).isEqualTo("123549876");
        assertThat(test.smallestNumber("DDD")).isEqualTo("4321");

    }
}
