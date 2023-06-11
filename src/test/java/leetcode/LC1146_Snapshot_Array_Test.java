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

        test = new LC1146_Snapshot_Array.SnapshotArray(1);
        test.set(0, 15);
        test.snap();
        test.snap();
        test.snap();
        assertThat(test.get(0, 2)).isEqualTo(15);
        test.snap();
        test.snap();
        assertThat(test.get(0, 0)).isEqualTo(15);

        test = new LC1146_Snapshot_Array.SnapshotArray(2);
        test.snap();
        assertThat(test.get(1, 0)).isEqualTo(0);
        assertThat(test.get(0, 0)).isEqualTo(0);
        test.set(1, 8);
        assertThat(test.get(1, 0)).isEqualTo(0);
        test.set(0, 20);
        assertThat(test.get(0, 0)).isEqualTo(0);
        test.set(0, 7);
    }
}
