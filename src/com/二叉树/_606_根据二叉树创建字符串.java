package com.二叉树;

public class _606_根据二叉树创建字符串 {
    public String tree2str(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        preorderTraversal(root, sb);
        return sb.toString();
    }

    public void preorderTraversal(TreeNode node, StringBuilder sb) {
        if (node == null) return;
        sb.append(node.val);
        if (node.left == null && node.right == null) return;
        sb.append("(");
        preorderTraversal(node.left, sb);
        sb.append(")");
        if (node.right == null) return;
        sb.append("(");
        preorderTraversal(node.right, sb);
        sb.append(")");
    }
}
