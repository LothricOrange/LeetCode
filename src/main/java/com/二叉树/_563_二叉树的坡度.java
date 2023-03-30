package com.二叉树;

public class _563_二叉树的坡度 {
    int result = 0;
    public int findTilt(TreeNode root) {
        if (root == null) return 0;
        sum(root);
        return result;
    }

    public int sum(TreeNode root) {
        if (root == null) return 0;
        int left = sum(root.left);
        int right = sum(root.right);
        result += Math.abs(left - right);
        return root.val + left + right;
    }


}
