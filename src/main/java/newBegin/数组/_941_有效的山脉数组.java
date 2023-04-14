package newBegin.数组;

public class _941_有效的山脉数组 {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) return false;
        int left = 0;
        int vLen = arr.length - 1;
        int right = vLen;
        while (left < vLen && arr[left] < arr[left + 1]) {
            left++;
        }
        while (right > 0 && arr[right] < arr[right - 1]) {
            right--;
        }
        return left == right && left != 0 && right != vLen;
    }
}
