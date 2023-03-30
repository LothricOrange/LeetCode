package leetCodeA.剑指Offer.第6天_搜索与回溯算法;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 剑指Offer32_II从上到下打印二叉树II {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int leaf = 1;
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
                list.add(sList);
                sList = new ArrayList<>();
            }

        }
        return list;
    }


}
