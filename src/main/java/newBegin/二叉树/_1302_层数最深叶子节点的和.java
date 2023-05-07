package newBegin.二叉树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _1302_层数最深叶子节点的和 {
    int sum = 0;
    int maxDepth = 0;
    public int deepestLeavesSum(TreeNode root) {
        if (root == null) return 0;
        helper(root, 0);
        return sum;
    }

    public void helper(TreeNode node, int level) {
        if (node == null) return;
        if (level > maxDepth) {
            maxDepth = level;
            sum = node.val;
        } else if (level == maxDepth) {
            sum += node.val;
        }
        helper(node.left, level + 1);
        helper(node.right, level + 1);
    }


    public int deepestLeavesSum2(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int leafSize = 1;
        List<Integer> list = null;
        while (!queue.isEmpty()) {
            list = new ArrayList<>();
            while (leafSize > 0) {
                leafSize--;
                TreeNode node = queue.poll();
                list.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            leafSize = queue.size();
        }
        int res = 0;
        for (int val : list) {
            res += val;
        }
        return res;
    }
}
