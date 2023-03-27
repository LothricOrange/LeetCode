package com.二叉树;

public class 剑指OfferII_054_所有大于等于节点的值之和 {
    int sum = 0;

    public TreeNode convertBST(TreeNode root) {
        if (root == null) return null;
        convertBST(root.right);
        sum += root.val;
        root.val = sum;
        convertBST(root.left);
        return root;
    }

}
