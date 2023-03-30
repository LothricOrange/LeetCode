package leetCodeA.算法入门.第3天_双指针;

public class _167_两数之和II_输入有序数组 {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        int[] arr = new int[2];
        while (left < right) {
            int num = numbers[left] + numbers[right];
            if (num == target) {
                arr[0] = left + 1;
                arr[1] = right + 1;
                return arr;
            } else if (num < target) {
                left++;
            } else {
                right--;
            }
        }
        return arr;
    }
}
