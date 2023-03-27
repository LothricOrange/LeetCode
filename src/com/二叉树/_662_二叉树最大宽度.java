package com.二叉树;

public class _662_二叉树最大宽度 {
    public int widthOfBinaryTree(TreeNode root) {
        TreeNode node = root;
        int height = 0;
        while (node.right != null) {
            height++;
            node = node.right;
        }
        int pow = (int)Math.pow(2, height);
        return 0;

    }

}
