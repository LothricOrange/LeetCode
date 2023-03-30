package leetCodeA.数据结构入门.第10天_树;

import java.util.*;

public class _145_二叉树的后序遍历 {
    List<Integer> list = new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) return list;
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        list.add(root.val);
        return list;
    }

    public List<Integer> postOrder(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        TreeNode prev = null;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode top = stack.peek();
            if ((top.left == null && top.right == null) || ((prev != null) && (top.left == prev || top.right == prev))) {
                prev = stack.pop();
                list.add(prev.val);
            } else {
                if (top.right != null) {
                    stack.push(top.right);
                }
                if (top.left != null) {
                    stack.push(top.left);
                }
            }
        }
        return list;

    }

    public List<Integer> postorder(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Deque<TreeNode> deq = new LinkedList<>();
        if(root == null) return res;

        TreeNode cur = root;
        deq.push(root);

        while(!deq.isEmpty()){
            cur = deq.peek();
            if(cur != null) {
                // cur = deq.pop();
                // deq.push(cur);
                deq.push(null);
                if(cur.right != null) deq.push(cur.right);
                if(cur.left != null) deq.push(cur.left);
            } else {
                deq.pop();
                cur = deq.pop();
                res.add(cur.val);
            }
        }

        return res;

    }
}
