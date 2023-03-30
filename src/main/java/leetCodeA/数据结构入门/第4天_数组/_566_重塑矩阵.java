package leetCodeA.数据结构入门.第4天_数组;

public class _566_重塑矩阵 {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int x = mat[0].length;
        int y = mat.length;
        int chicken = x * y;
        if (chicken != r * c) return mat;
        int[][] arr = new int[r][c];
        for (int i = 0; i < chicken; i++) {
            arr[i / c][i % c] = mat[i / x][i % x];
        }
        return arr;
    }
}
