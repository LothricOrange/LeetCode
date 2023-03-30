package leetCodeA.算法入门.第13天_位运算;

public class _231_2的幂 {
    public boolean isPowerOfTwo(int n) {
        /*int temp = 1;
        while (temp < n) {
            temp = temp >> 1;
        }
        if (temp == n) return true;
        return false;*/
        if (n <= 0) return false;
        return (n & (n - 1)) == 0;
    }
}
