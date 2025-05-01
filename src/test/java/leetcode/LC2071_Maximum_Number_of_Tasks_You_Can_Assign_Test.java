package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC2071_Maximum_Number_of_Tasks_You_Can_Assign_Test {
    LC2071_Maximum_Number_of_Tasks_You_Can_Assign test = new LC2071_Maximum_Number_of_Tasks_You_Can_Assign();

    @Test
    void exampleTest() {
        assertThat(test.maxTaskAssign(new int[]{3, 2, 1}, new int[]{0, 3, 3}, 1, 1)).isEqualTo(3);
        assertThat(test.maxTaskAssign(new int[]{5, 4}, new int[]{0, 0, 0}, 1, 5)).isEqualTo(1);
        assertThat(test.maxTaskAssign(new int[]{10, 15, 30}, new int[]{0, 10, 10, 10, 10}, 1, 1)).isEqualTo(2);
    }
}
