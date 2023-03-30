package com.二叉树;

public class _897_递增顺序搜索树 {
    public TreeNode increasingBST(TreeNode root) {
        if (root == null) return null;
        increasingBST(root.left);
        increasingBST(root.right);
        return root;
    }

}
