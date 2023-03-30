package com.二叉树;

import java.util.LinkedList;
import java.util.Queue;

public class _226_翻转二叉树 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return root;
        TreeNode node = root.left;
        root.left = root.right;
        root.right = node;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

    public TreeNode invertTree2(TreeNode root) {
        if (root == null) return root;
        invertTree2(root.left);
        TreeNode node = root.left;
        root.left = root.right;
        root.right = node;
        invertTree2(root.left);
        return root;
    }

    public TreeNode invertTree3(TreeNode root) {
        if (root == null) return root;
        invertTree3(root.left);
        invertTree3(root.right);
        TreeNode node = root.left;
        root.left = root.right;
        root.right = node;
        return root;
    }

    public TreeNode invertTree4(TreeNode root) {
        if (root == null) return root;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
        }

        return root;
    }
}
