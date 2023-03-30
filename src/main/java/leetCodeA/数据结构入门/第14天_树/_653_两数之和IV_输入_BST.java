package leetCodeA.数据结构入门.第14天_树;

import java.util.HashMap;
import java.util.HashSet;

public class _653_两数之和IV_输入_BST {
    HashSet<Integer> set = new HashSet<>();
    public boolean findTarget(TreeNode root, int k) {
        if (root == null) return false;
        if (set.contains(root.val)) return true;
        set.add(k - root.val);
        return findTarget(root.left, k) || findTarget(root.right, k);
    }
}
