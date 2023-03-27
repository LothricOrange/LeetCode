package leetCodeA.leetCode75.第6天;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _102_二叉树的层序遍历 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) return list;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int leaf = 1;
        List<Integer> sList = new ArrayList<>();
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            leaf--;
            sList.add(node.val);

            if (node.left != null) queue.offer(node.left);
            if (node.right != null) queue.offer(node.right);

            if (leaf == 0) {
                leaf = queue.size();
                list.add(sList);
                sList = new ArrayList<>();
            }
        }

        return list;
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
