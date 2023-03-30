package leetCodeA.数据结构入门.第5天_数组;

public class _36_有效的数独 {
    public static boolean isValidSudoku(char[][] board) {
        int[][] row = new int[9][9];
        int[][] col = new int[9][9];
        int[][] box = new int[9][9];
        int num;
        int index;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') continue;
                num = board[i][j] - '1';
                if (row[i][num] == 1) return false;
                if (col[j][num] == 1) return false;
                index = j / 3 + (i / 3) * 3;
                if (box[index][num] == 1) return false;
                row[i][num] = 1;
                col[j][num] = 1;
                box[index][num] = 1;
            }
        }
        return true;
    }
}
