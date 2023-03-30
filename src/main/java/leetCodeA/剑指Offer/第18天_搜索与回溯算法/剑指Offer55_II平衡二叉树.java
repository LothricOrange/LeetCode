package leetCodeA.剑指Offer.第18天_搜索与回溯算法;

public class 剑指Offer55_II平衡二叉树 {

    Boolean flag = true;
    public boolean isBalanced(TreeNode root) {
        dfs(root);
        return flag;
    }

    public int dfs(TreeNode root) {
        if (root == null || !flag) return 0;

        int left = dfs(root.left);
        int right = dfs(root.right);
        if (Math.abs(left - right) > 1) flag = false;

        return 1 + Math.max(left, right);
    }


    public boolean isBalanced2(TreeNode root) {
        if (root == null) return true;
        if (Math.abs(maxDepth(root.left) - maxDepth(root.right)) <= 1) {
            return isBalanced2(root.left) && isBalanced2(root.right);
        }
        return false;
    }

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
