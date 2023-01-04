package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0944_Delete_Columns_to_Make_Sorted_Test {
    @Test
    void test() {
        LC0944_Delete_Columns_to_Make_Sorted test = new LC0944_Delete_Columns_to_Make_Sorted();
        assertThat(test.minDeletionSize(new String[]{"abc", "bce", "cae"})).isEqualTo(1);
        assertThat(test.minDeletionSize(new String[]{"a", "b"})).isEqualTo(0);
        assertThat(test.minDeletionSize(new String[]{"zyx", "wvu", "tsr"})).isEqualTo(3);
    }
}
