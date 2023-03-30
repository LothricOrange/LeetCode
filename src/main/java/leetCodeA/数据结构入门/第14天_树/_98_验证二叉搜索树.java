package leetCodeA.数据结构入门.第14天_树;

import java.util.ArrayList;
import java.util.List;

public class _98_验证二叉搜索树 {
    List<Integer> list = new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        list = inorderTraversal(root);
        int oldNum = list.get(0);
        int num;
        for (int i = 1; i < list.size(); i++) {
            num = list.get(i);
            if (num <= oldNum) {
                return false;
            }
            oldNum = num;
        }
        return true;
    }


    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) return list;
        inorderTraversal(root.left);
        list.add(root.val);
        inorderTraversal(root.right);
        return list;
    }

    public boolean isValidBST2(TreeNode root) {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean validate(TreeNode node, long min, long max) {
        if (node == null) {
            return true;
        }
        if (node.val <= min || node.val >= max) {
            return false;
        }
        return  validate(node.left, min, node.val) && validate(node.right, node.val, max);
    }
}
