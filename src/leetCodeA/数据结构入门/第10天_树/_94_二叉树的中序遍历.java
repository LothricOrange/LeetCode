package leetCodeA.数据结构入门.第10天_树;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _94_二叉树的中序遍历 {
    List<Integer> list = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) return list;
        inorderTraversal(root.left);
        list.add(root.val);
        inorderTraversal(root.right);
        return list;
    }

    public List<Integer> inorderTraversal2(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        TreeNode node = root;
        Stack<TreeNode> stack = new Stack<>();
        while (true) {
            if (node != null) {
                stack.push(node);
                node = node.left;
            } else if (stack.isEmpty()) {
                return list;
            } else {
                node = stack.pop();
                list.add(node.val);
                node = node.right;
            }
        }
    }
}
