package com.二叉树;

import java.util.ArrayList;
import java.util.List;

public class _144_二叉树的前序遍历 {
    List<Integer> list = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) return list;
        list.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return list;
    }


}
