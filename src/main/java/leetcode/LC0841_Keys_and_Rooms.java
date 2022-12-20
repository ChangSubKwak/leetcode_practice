package leetcode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class LC0841_Keys_and_Rooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visit = new boolean[1001];
        Set<Integer> set = new HashSet<>();
        LinkedList<Integer> queue = new LinkedList<>();

        queue.addAll(rooms.get(0));
        set.addAll(rooms.get(0));

        while (queue.size() > 0) {
            int roomNum = queue.poll();

            if (visit[roomNum]) {
                continue;
            }

            visit[roomNum] = true;

            for (int i = 0; i < rooms.get(roomNum).size(); i++) {
                int key = rooms.get(roomNum).get(i);

                if (set.contains(key)) {
                    continue;
                }
                set.add(key);
                queue.addLast(key);
            }
        }

        set.remove(0);
        return set.size() == (rooms.size() - 1);
    }
}
