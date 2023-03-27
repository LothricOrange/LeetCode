package com.二叉树;

import java.util.LinkedList;
import java.util.Queue;

public class _104_二叉树的最大深度 {
    public int maxDepth2(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int height = 0;
        int levelSize = 1;
        while (!queue.isEmpty()) {
            TreeNode newNode = queue.poll();
            levelSize--;
            if (newNode.left != null) {
                queue.offer(newNode.left);
            }
            if (newNode.right != null) {
                queue.offer(newNode.right);
            }
            if (levelSize == 0) {
                levelSize = queue.size();
                height++;
            }
        }
        return height;
    }

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
