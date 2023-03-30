package com.二叉树;

public class _面试题_04_02_最小高度树 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length);
    }

    public TreeNode helper(int[] nums, int left, int right) {
        if (left == right) return null;
        int mid = (left + right) >> 1;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = helper(nums, left, mid);
        node.right = helper(nums, mid + 1, right);
        return node;
    }
}
