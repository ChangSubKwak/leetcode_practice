package leetcode;

import java.util.*;

public class LC1146_Snapshot_Array {
    static class SnapshotArray {

        private Map<Integer, TreeMap<Integer, Integer>> map;
        private int snapShotId;

        public SnapshotArray(int length) {
            map = new HashMap<>();
            snapShotId = 0;
        }

        public void set(int index, int val) {
            TreeMap<Integer, Integer> data = new TreeMap<>();
            if (map.containsKey(index)) {
                data = map.get(index);
            }
            data.put(snapShotId, val);
            map.put(index, data);
        }

        public int snap() {
            snapShotId++;
            return snapShotId - 1;
        }

        public int get(int index, int snap_id) {
            if (!map.containsKey(index)) {
                return 0;
            }

            if (!map.get(index).containsKey(snap_id)) {
                if (map.get(index).lowerEntry(snap_id) == null) {
                    return 0;
                }
                return map.get(index).lowerEntry(snap_id).getValue();
            }

            return map.get(index).get(snap_id);
        }
    }
}
