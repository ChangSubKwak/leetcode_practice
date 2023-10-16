package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC1095_Find_in_Mountain_Array_Test {
    @Test
    void test() {
        LC1095_Find_in_Mountain_Array test = new LC1095_Find_in_Mountain_Array();
        LC1095_Find_in_Mountain_Array.MountainArray mountainArray = new LC1095_Find_in_Mountain_Array.MountainArray(new int[]{1, 2, 3, 4, 5, 3, 1});
        assertThat(test.findInMountainArray(3, mountainArray)).isEqualTo(2);

        mountainArray = new LC1095_Find_in_Mountain_Array.MountainArray(new int[]{0, 1, 2, 4, 2, 1});
        assertThat(test.findInMountainArray(3, mountainArray)).isEqualTo(-1);

    }
}
