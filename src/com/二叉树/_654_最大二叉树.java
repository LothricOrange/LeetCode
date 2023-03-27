package com.二叉树;

import java.util.Arrays;
import java.util.HashMap;

public class _654_最大二叉树 {

    public TreeNode constructMaximumBinaryTree(int[] nums) {

        return maxTree(nums, 0, nums.length);
    }

    public TreeNode maxTree(int[] nums, int begin, int end) {
        if (begin >= end) return null;
        int maxIndex = findMaxIndex(nums, begin, end);
        TreeNode node = new TreeNode(nums[maxIndex]);
        node.left = maxTree(nums, begin, maxIndex);
        node.right = maxTree(nums, maxIndex + 1, end);
        return node;
    }

    public int findMaxIndex(int[] nums, int begin, int end) {
        int maxIndex = 0;
        int max = Integer.MIN_VALUE;
        for (int i = begin; i < end; i++) {
            if (nums[i] > max) {
                maxIndex = i;
                max = nums[i];
            }
        }
        return maxIndex;
    }


}
