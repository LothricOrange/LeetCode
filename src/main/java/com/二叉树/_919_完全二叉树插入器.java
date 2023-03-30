package com.二叉树;

import java.util.*;

public class _919_完全二叉树插入器 {
    TreeNode root;
    List<TreeNode> list;

    public _919_完全二叉树插入器(TreeNode root) {
        this.root = root;
        list = new ArrayList<>();
        list.add(null);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            list.add(node);
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
        }
    }

    public int insert(int val) {
        TreeNode node = new TreeNode(val);
        list.add(node);
        int tmp = list.size() - 1;
        int parentIndex = tmp >> 1;
        TreeNode parent = list.get(parentIndex);
        if ((tmp & 1) == 0) {
            parent.left = node;
        } else {
            parent.right = node;
        }

        return parent.val;
    }

    public TreeNode get_root() {
        return root;
    }
}
