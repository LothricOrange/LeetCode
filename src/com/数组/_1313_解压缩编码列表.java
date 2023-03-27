package com.数组;

public class _1313_解压缩编码列表 {
    public int[] decompressRLElist(int[] nums) {
        int[] arr;
        int len = 0;
        if (nums.length == 2) {
            len = nums[0];
            arr = new int[len];
            for (int i = 0; i < len; i++) {
                arr[i] = nums[1];
            }
        } else {

            int index = 0;
            for (int i = 0; i < nums.length; i += 2) {
                len += nums[i];
            }
            arr = new int[len];
            for (int i = 0; i < nums.length; i += 2) {
                while(nums[i] > 0){
                    arr[index] = nums[i + 1];
                    nums[i]--;
                    index++;
                }
            }
        }

        return arr;
    }
}
