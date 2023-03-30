package com.二叉树;

import java.util.HashSet;

public class _44_开幕式焰火 {
    HashSet<Integer> hashSet = new HashSet<>();

    public int numColor(TreeNode root) {
        if (root != null) {
            hashSet.add(root.val);
            numColor(root.left);
            numColor(root.right);
        }

        return hashSet.size();
    }
}
