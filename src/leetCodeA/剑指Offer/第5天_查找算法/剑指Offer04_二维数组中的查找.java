package leetCodeA.剑指Offer.第5天_查找算法;

public class 剑指Offer04_二维数组中的查找 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int row = matrix.length;
        if (row == 0) return false;
        int col = matrix[0].length;
        if (col == 0) return false;
        int left = col - 1;
        int right = 0;

        while (left >= 0 && right < row) {
            int root = matrix[right][left];
            if (target < root) {
                left--;
            } else if (target > root){
                right++;
            } else {
                return true;
            }
        }
        return false;
    }
}
