package leetCodeA.算法入门.第2天_双指针;

public class _189_旋转数组 {
    public void rotate(int[] nums, int k) {

        k = k % nums.length;
        int[] array1 = new int[k];
        int[] array2 = new int[nums.length - k];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = nums[i+nums.length - k];
        }
        for (int i = 0; i < array2.length; i++) {
            array2[i] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            if(i < k) {
                nums[i] = array1[i];
            }else {
                nums[i] = array2[i-k];
            }
        }
    }
}
