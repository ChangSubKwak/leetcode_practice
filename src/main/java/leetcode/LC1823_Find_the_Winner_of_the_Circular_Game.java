package leetcode;

import java.util.LinkedList;

public class LC1823_Find_the_Winner_of_the_Circular_Game {
    public int findTheWinner(int n, int k) {
        LinkedList<Integer> friend = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            friend.add(i);
        }

        int i = 0;
        while (friend.size() >= 2) {
            i += (k - 1);
            i %= friend.size();
            friend.remove(i);
        }

        int result = friend.get(0);

        return result;
    }
}
