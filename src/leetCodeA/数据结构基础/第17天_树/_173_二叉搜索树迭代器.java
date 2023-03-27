package leetCodeA.数据结构基础.第17天_树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _173_二叉搜索树迭代器 {
    List<Integer> list = new LinkedList<>();
    public _173_二叉搜索树迭代器(TreeNode root) {
        inorderTraversal(root);
    }

    public void inorderTraversal(TreeNode root) {
        if (root == null) return;
        inorderTraversal(root.left);
        list.add(root.val);
        inorderTraversal(root.right);
        return;
    }

    public int next() {
        return list.remove(0);
    }

    public boolean hasNext() {
        return !list.isEmpty();
    }
}
