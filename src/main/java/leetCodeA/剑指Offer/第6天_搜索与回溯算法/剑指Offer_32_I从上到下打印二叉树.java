package leetCodeA.剑指Offer.第6天_搜索与回溯算法;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class 剑指Offer_32_I从上到下打印二叉树 {
    public int[] levelOrder(TreeNode root) {
        if (root == null) return new int[0];
        ArrayList<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            list.add(node.val);

            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
        }

        int[] arr = new int[list.size()];
        int i = 0;
        for (int val : list) {
            arr[i] = val;
            i++;
        }
        return arr;
    }
}
