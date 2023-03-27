package leetCodeA.剑指Offer.第15天_搜索与回溯算法;

import java.util.ArrayList;
import java.util.List;

public class 剑指Offer54_二叉搜索树的第k大节点 {
    int num;
    int ans;
    public int kthLargest(TreeNode root, int k) {
        num = k;
        inorderTraversal(root);
        return ans;
    }

    public void inorderTraversal(TreeNode node) {
        if (node.right != null) inorderTraversal(node.right);
        num--;
        if (num == 0) {
            ans = node.val;
            return;
        }
        if (node.left != null) inorderTraversal(node.left);
    }


    public int kthLargest2(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        inorderTraversal2(root, list);
        return list.get(list.size() - k);
    }

    public List<Integer> inorderTraversal2(TreeNode root, List<Integer> list) {
        if (root == null) return list;
        inorderTraversal2(root.right, list);
        list.add(root.val);
        inorderTraversal2(root.left, list);
        return list;
    }


    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
