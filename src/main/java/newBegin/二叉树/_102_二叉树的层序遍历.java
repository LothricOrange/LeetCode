package newBegin.二叉树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _102_二叉树的层序遍历 {
    List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> levelOrderII(TreeNode root) {
        if (root == null) return list;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        TreeNode node;
        while (!queue.isEmpty()) {
            List<Integer> sonList = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                node = queue.poll();
                sonList.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            list.add(sonList);
        }
        return list;
    }

    public List<List<Integer>> levelOrderI(TreeNode root) {
        if (root == null) return list;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        TreeNode node;
        List<Integer> sonList = new ArrayList<>();
        int leaf = 1;
        while (!queue.isEmpty()) {
            node = queue.poll();
            sonList.add(node.val);
            leaf--;
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
            if (leaf == 0) {
                leaf = queue.size();
                list.add(sonList);
                sonList = new ArrayList<>();
            }
        }
        return list;
    }
}
