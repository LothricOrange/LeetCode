package com.二叉树;

import java.util.HashMap;
import java.util.Map;
//#####
public class _450_删除二叉搜索树中的节点 {
    Map<TreeNode, TreeNode> map = new HashMap<>();

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;
        TreeNode node = helper(root, key);
        TreeNode parent = map.get(node);

        if (node.left != null && node.right != null) {
            TreeNode p = predecessor(node);
            node.val = p.val;
            node = p;
        }
        TreeNode temp = node.left != null ? node.left : node.right;
        TreeNode tParent = null;
        TreeNode nParent = null;
        if (temp != null) {
            tParent = map.get(temp);
            nParent = map.get(node);
            tParent = nParent;
            if (nParent == null) {
                root = temp;
            } else if (node == nParent.left) {
                nParent.left = temp;
            } else {
                nParent.right = temp;
            }
        } else if (nParent == null) {
            root = null;
        } else {
            if (nParent.left == node) {
                nParent.left = null;
            } else {
                nParent.right = null;
            }
        }

        return root;
    }
    
    
    public TreeNode helper(TreeNode node, int key) {
        if (node == null) return null;
        
        if (node.val == key) return node;
        TreeNode leftNode = null;
        if (node.left != null) {
            map.put(node.left, node);
            leftNode = helper(node.left, key);
        }
        TreeNode rightNode = null;
        if (node.right != null) {
            map.put(node.right, node);
            rightNode = helper(node.right, key);
        }
        
        return leftNode == null ? null : rightNode;
    }

    
    private TreeNode predecessor(TreeNode node) {
        if (node == null) return null;
        TreeNode p = node.left;
        if (p != null) {
            while (p.right != null) {
                p = p.right;
            }
            return p;
        }
        
        
        while (map.get(node) != null && node == map.get(node).left) {
            node = map.get(node);
        }
        return map.get(node);
    }

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
