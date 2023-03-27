package leetCodeA.数据结构基础.第16天_树;

import java.util.HashMap;

public class _450_删除二叉搜索树中的节点 {
    TreeNode rmNode = null;
    HashMap<TreeNode, TreeNode> parents = new HashMap<>();
    public TreeNode deleteNode(TreeNode root, int key) {
        makeParents(root, key);
        parents.remove(null);

        if (rmNode == null) return root;
        if (rmNode.left != null && rmNode.right != null) {
            TreeNode p = predecessor(rmNode);
            rmNode.val = p.val;
            rmNode = p;
        }
        TreeNode temp = rmNode.left != null ? rmNode.left : rmNode.right;
        TreeNode parent = parents.get(rmNode);
        if (temp != null) {
            if (parent == null) {
                root = temp;
            } else if (rmNode == parent.left) {
                parent.left = temp;
            } else {
                parent.right = temp;
            }
        } else if (parent == null) {
            root = null;
        } else {
            if (parent.left == rmNode) {
                parent.left = null;
            } else {
                parent.right = null;
            }
        }


        return root;
    }

    /*public TreeNode findNode(TreeNode node, int key) {
        if (node == null) return null;
        if (node.val == key) return node;
        return findNode(node.left, key) == null ? findNode(node.right, key) : null;
    }*/
    private void makeParents(TreeNode node, int key) {
        while (node != null) {
            if (node.val == key) rmNode = node;
            parents.put(node.left, node);
            parents.put(node.right, node);
        }
        makeParents(node.left, key);
        makeParents(node.right, key);
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

        while (parents.get(node) != null && node == parents.get(node).left) {
            node = parents.get(node);
        }
        return parents.get(node);
    }
}
