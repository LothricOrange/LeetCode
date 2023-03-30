package leetCodeA.数据结构入门.第13天_树;

public class _700_二叉搜索树中的搜索 {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return null;
        int compare;

        while (root != null) {
            compare = val - root.val;
            if (compare > 0) {
                root = root.right;
            } else if (compare < 0) {
                root = root.left;
            } else {
                return root;
            }
        }
        return root;
    }
}
