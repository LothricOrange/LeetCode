package leetCodeA.leetCode75.第1天;

public class _724_寻找数组的中心下标 {
    public int pivotIndex(int[] nums) {
        int[] arr1 = nums.clone();
        int[] arr2 = nums.clone();
        for (int i = arr1.length - 1; i > 0; i--) {
            arr1[i - 1] += arr1[i];
        }

        for (int i = 1; i < arr2.length; i++) {
            arr2[i] += arr2[i - 1];
        }

        for (int i = 0; i < nums.length; i++) {
            if (arr1[nums.length - i - 1] == arr2[i]) return i + 1;

        }

        return -1;
    }
}
