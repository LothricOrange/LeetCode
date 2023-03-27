package leetCodeA.算法入门.第1天_二分查找;

public class _278_第一个错误的版本 {
    public int firstBadVersion(int n) {
        int low = 0;
        int high = n;
        while(low <= high) {
            int middle = low + (high - low) / 2;
            if(isBadVersion(middle)) {
                high = middle - 1;
            }else {
                low = middle + 1;
            }
        }
        return low;
    }

    public boolean isBadVersion(int m) {
        return false;
    }
}
