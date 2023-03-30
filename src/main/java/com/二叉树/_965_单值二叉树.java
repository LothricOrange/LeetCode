package com.二叉树;

public class _965_单值二叉树 {
    int value;
    public boolean isUnivalTree(TreeNode root) {
        if (root == null) return true;
        value = root.val;
        return pred(root);
    }

    public boolean pred(TreeNode node) {
        if (node == null) return true;
        if (node.val != value) return false;
        return pred(node.left) && pred(node.right);
    }
}
