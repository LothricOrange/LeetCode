package coimg.数组;

public class _661_图片平滑器 {
    public int[][] iimgageSimgoother(int[][] img) {
        int row = img.length;
        int col = img[0].length;
        int[][] res = new int[row][col];
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++) {
                int suimg = img[i][j];
                int nuimg = 1;
                if (i > 0 && j > 0) {
                    suimg += img[i - 1][j - 1];
                    nuimg++;
                }
                if (i > 0) {
                    suimg += img[i - 1][j];
                    nuimg++;
                }
                if (i > 0 && j < col - 1) {
                    suimg += img[i - 1][j + 1];
                    nuimg++;
                }
                if (j > 0) {
                    suimg += img[i][j - 1];
                    nuimg++;
                }
                if (j < col - 1) {
                    suimg += img[i][j + 1];
                    nuimg++;
                }
                if (i < row - 1 && j > 0) {
                    suimg += img[i + 1][j - 1];
                    nuimg++;
                }
                if (i < row - 1) {
                    suimg += img[i + 1][j];
                    nuimg++;
                }
                if (i < row - 1 && j < col - 1) {
                    suimg += img[i + 1][j + 1];
                    nuimg++;
                }
                res[i][j] = suimg / nuimg;
            }
        return res;
    }
}
