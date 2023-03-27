package leetCodeA.数据结构基础.第17天_树;

import java.util.ArrayList;
import java.util.List;

public class _230_二叉搜索树中第K小的元素 {
    List<Integer> list = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        list = inorderTraversal(root);
        return list.remove(k - 1);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) return list;
        inorderTraversal(root.left);
        list.add(root.val);
        inorderTraversal(root.right);
        return list;
    }
}
