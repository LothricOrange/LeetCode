package com.二叉树;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _655_输出二叉树 {
    public List<List<String>> printTree(TreeNode root) {
        if (root == null) return null;
        int row = height(root);
        int width = (int)Math.pow(2, row) - 1;
        String[][] arr = new String[row][width];

        List<List<String>> res = new ArrayList<>(row);
        for (int i = 0; i < arr.length; i++) {
            Arrays.fill(arr[i], "");
            res.add(Arrays.asList(arr[i]));
        }
        helper(arr, root, 0, 0, width);
        return res;
    }

    public int height(TreeNode node) {
        if (node == null) return 0;
        return Math.max(height(node.left), height(node.right)) + 1;
    }

    public void helper(String[][] arr, TreeNode node, int height, int begin, int end) {
        if (node == null) return;
        String str = String.valueOf(node.val);
        int mid = (begin + end) >> 1;
        arr[height][mid] = str;
        helper(arr, node.left, height + 1, begin, mid);
        helper(arr, node.right, height + 1, mid, end);
    }
}
