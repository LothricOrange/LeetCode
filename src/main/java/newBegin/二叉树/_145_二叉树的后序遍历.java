package newBegin.二叉树;

import java.util.ArrayList;
import java.util.List;

public class _145_二叉树的后序遍历 {
    List<Integer> list = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) return list;
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        list.add(root.val);
        return list;
    }
}
