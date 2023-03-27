package com.二叉树;

public class _814_二叉树剪枝 {
    public TreeNode pruneTree(TreeNode root) {

        return orderHelper(root);
    }

    public TreeNode orderHelper(TreeNode node) {
        if (node == null) return null;
        node.left = orderHelper(node.left);
        node.right = orderHelper(node.right);
        if (node.left == null && node.right == null && node.val == 0) {
            return null;
        }
        return node;
    }


}
