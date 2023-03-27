package com.二叉树;

import java.util.LinkedList;
import java.util.Queue;

public class _623_在二叉树中增加一行 {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if (depth == 1) {
            TreeNode node = new TreeNode(val);
            node.left = root;
            return node;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int h = 1;
        while (!queue.isEmpty()) {
            int leaf = queue.size();
            while (leaf > 0) {
                leaf--;
                TreeNode node = queue.poll();
                if (h == depth - 1) {
                    TreeNode nodeA = new TreeNode(val);
                    TreeNode nodeB = new TreeNode(val);
                    nodeA.left = node.left;
                    nodeB.right = node.right;
                    node.left = nodeA;
                    node.right = nodeB;
                    continue;
                }

                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            h++;
        }
        return root;
    }
}
