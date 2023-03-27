package com.二叉树;

public class 剑指OfferII051_节点之和最大的路径 {
    int sum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        returnMax(root);
        return sum;
    }

    public int returnMax(TreeNode node) {
        if (node == null) return 0;
        int leftValue = Math.max(returnMax(node.left), 0);
        int rightValue = Math.max(returnMax(node.right), 0);
        sum = Math.max(sum, node.val + leftValue + rightValue);
        return node.val + Math.max(leftValue, rightValue);
    }
}
