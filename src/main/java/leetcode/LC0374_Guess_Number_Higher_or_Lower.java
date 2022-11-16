package leetcode;

public class LC0374_Guess_Number_Higher_or_Lower {

    static class GuessGame {
        private int pick;

        public GuessGame(int pick) {
            this.pick = pick;
        }

        public GuessGame from(int pick) {
            return new GuessGame(pick);
        }

        public int guess(int num) {
            if (pick == num) {
                return 0;
            }

            if (pick < num) {
                return -1;
            }

            return 1;
        }
    }

    static class Solution extends GuessGame {
        public Solution(int pick) {
            super(pick);
        }

        private int recur(int start, int end) {
            int mid = Math.max((int)(((long)start + (long)end) / 2L), 1);
            // System.out.println("mid = " + mid);
            if (guess(mid) == 0) {
                return mid;
            }

            if (guess(mid) > 0) {
                return recur(mid + 1, end);
            }

            return recur(start, mid - 1);
        }

        public int guessNumber(int n) {
            return recur(1, n);
        }
    }
}
