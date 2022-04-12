package leetcode;

public class LC0289_Game_of_Life {
    public void gameOfLife(int[][] board) {
        int row = board.length;
        int col = board[0].length;
        
        int[][] nextState = new int[row][col];
        
        int[] dx = new int[] {-1, 0, 1, 1, 1, 0,-1,-1 };
        int[] dy = new int[] {-1,-1,-1, 0, 1, 1, 1, 0 };
        
        for (int y = 0; y < row; y++) {
            for (int x = 0; x < col; x++) {
                int liveCount = 0;
                for (int z = 0; z < 8; z++) {
                    if (y + dy[z] < 0 || y + dy[z]  > row - 1 || x + dx[z]  < 0 || x + dx[z]  > col -1 ) {
                        continue;
                    }
                    if (board[y + dy[z]][x + dx[z]] == 1) {
                        liveCount++;
                    }
                }
                
                if (board[y][x] == 1 && liveCount < 2) {
                    nextState[y][x] = 0;
                    continue;
                }
                
                if (board[y][x] == 1 && liveCount <= 3) {
                    nextState[y][x] = 1;
                    continue;
                }
                
                if (board[y][x] == 1 && liveCount > 3) {
                    nextState[y][x] = 0;
                    continue;
                }
                
                if (board[y][x] == 0 && liveCount == 3) {
                    nextState[y][x] = 1;
                }
            }
        }
        
        for (int y = 0; y < row; y++) {
            for (int x = 0; x < col; x++) {
                board[y][x] = nextState[y][x];
            }
        }
    }
}
