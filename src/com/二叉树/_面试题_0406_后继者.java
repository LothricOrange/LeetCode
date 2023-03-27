package com.二叉树;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _面试题_0406_后继者 {
    List<TreeNode> list = new ArrayList<>();
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        inorder(root);
        Iterator<TreeNode> it = list.iterator();
        while (it.hasNext()) {
            TreeNode next = it.next();
            if (next == p) {
                if (it.hasNext()) return it.next();
                else return null;
            }
        }
        return null;
    }

    public void inorder(TreeNode node) {
        if (node == null) return;
        inorder(node.left);
        list.add(node);
        inorder(node.right);
    }
}
