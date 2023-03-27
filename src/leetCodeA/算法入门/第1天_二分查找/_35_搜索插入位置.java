package leetCodeA.算法入门.第1天_二分查找;

public class _35_搜索插入位置 {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        if(target < nums[low]) {
            return low;
        }
        if(target > nums[high]) {
            return high + 1;
        }
        while(low <= high) {
            int middle = low + (high - low)/2;
            if(target < nums[middle]) {
                high = middle - 1;
            } else if(target > nums[middle]) {
                low = middle + 1;
            } else {
                return middle;
            }
        }
        return low;
    }
}
