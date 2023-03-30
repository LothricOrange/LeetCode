package leetCodeA.剑指Offer.第7天_搜索与回溯算法;

import java.util.LinkedList;
import java.util.Queue;

public class 剑指Offer28_对称的二叉树 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return tool(root.left, root.right);
    }

    public boolean tool(TreeNode nodeA, TreeNode nodeB) {
        if (nodeA == null) {
            if (nodeB == null) return true;
            else return false;
        } else {
            if (nodeB == null) return false;
        }

        return nodeA.val == nodeB.val && tool(nodeA.left, nodeB.right) && tool(nodeA.right, nodeB.left);
    }
}
