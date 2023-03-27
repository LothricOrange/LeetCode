package com.二叉树;

public class 剑指Offer68_二叉搜索树的最近公共祖先 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if (root.val < p.val && root.val < q.val) {
            return lowestCommonAncestor(root.right, p, q);
        } else if (root.val > p.val && root.val > q.val){
            return lowestCommonAncestor(root.left, p, q);
        } else {
            return root;
        }

    }
}
