package leetCodeA.剑指Offer.第6天_搜索与回溯算法;

import java.util.*;

public class 剑指Offer32_III_从上到下打印二叉树III {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int leaf = 1;
        Boolean flag = false;
        List<Integer> sList = new ArrayList<>();
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            sList.add(node.val);
            leaf--;

            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }

            if (leaf == 0) {
                leaf = queue.size();
                if (flag) {
                    Collections.reverse(sList);
                    flag = false;
                } else {
                    flag = true;
                }
                list.add(sList);
                sList = new ArrayList<>();
            }

        }
        return list;
    }
}
