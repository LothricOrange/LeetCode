package leetCodeA.数据结构入门.第11天_树;

public class _101_对称二叉树 {
    public boolean isSymmetric(TreeNode root) {
        return isEquals(root, root);
    }

    public boolean isEquals(TreeNode t1, TreeNode t2) {
        if(t1 != null && t2 != null && t1.val == t2.val) {
            return isEquals(t1.left, t2.right) && isEquals(t1.right, t2.left);
        } else if (t1 == null && t2 == null) {
            return true;
        } else {
            return false;
        }
    }
}
