package leetCodeA.算法入门.第1天_二分查找;

public class _704_二分查找 {
    public int search(int[] nums, int target) {
        int low = 0;
        int middle;
        int high = nums.length - 1;
        while (low <= high){
            middle = (low + high) >> 1;
            if (target < nums[middle]) {
                high = middle - 1;
            } else if (target > nums[middle]) {
                low = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }


}
