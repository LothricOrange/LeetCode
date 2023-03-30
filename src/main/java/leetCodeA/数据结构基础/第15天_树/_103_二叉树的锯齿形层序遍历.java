package leetCodeA.数据结构基础.第15天_树;

import java.util.*;

public class _103_二叉树的锯齿形层序遍历 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> sonList = new ArrayList<>();
        if (root == null) {
            return list;
        }
        int num = 0;
        int levelSize = 1;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            sonList.add(node.val);
            levelSize--;
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
            if (levelSize == 0) {
                levelSize = queue.size();
                if ((num & 1) != 0) {
                    Collections.reverse(sonList);
                }
                list.add(sonList);
                num++;
                sonList = new ArrayList<>();
            }


        }
        return list;
    }
}
