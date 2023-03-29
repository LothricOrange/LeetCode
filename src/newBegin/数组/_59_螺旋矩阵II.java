package newBegin.数组;

public class _59_螺旋矩阵II {
    public int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        int offset = 1;
        int count = 1;
        int startX = 0;
        int startY = 0;
        int halfValue = n >> 1;
        int loop = halfValue;
        while (loop > 0) {
            int last = n - offset;
            for (int i = startX; i < last; i++) {
                arr[startY][i] = count;
                count++;
            }

            for (int j = startY; j < last; j++) {
                arr[j][last] = count;
                count++;
            }

            for (int i = last; i > startX; i--) {
                arr[last][i] = count;
                count++;
            }

            for (int j = last; j > startY; j--) {
                arr[j][startX] = count;
                count++;
            }
            startX++;
            startY++;
            offset++;
            loop--;
        }
        if ((n & 1) == 1) arr[halfValue][halfValue] = count;
        return arr;
    }
}
