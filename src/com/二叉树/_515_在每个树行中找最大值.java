package com.二叉树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _515_在每个树行中找最大值 {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        if (root == null) return list;
        int levelSize = 1;
        int max = root.val;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (levelSize > 0) {
                max = Math.max(max, node.val);
            }
            levelSize--;
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
            if (levelSize == 0) {
                levelSize = queue.size();
                list.add(max);
                max = Integer.MIN_VALUE;
            }


        }


        return list;
    }
}
