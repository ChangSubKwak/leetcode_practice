package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

class LC1146_Snapshot_Array_Test {
    @Test
    void test() {
        LC1146_Snapshot_Array.SnapshotArray test = new LC1146_Snapshot_Array.SnapshotArray(3);
        test.set(0, 5);
        test.snap();
        test.set(0, 6);

        assertThat(test.get(0, 0)).isEqualTo(5);
    }
}
