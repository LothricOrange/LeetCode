package newBegin.二叉树;

public class _222_完全二叉树的节点个数 {
    int count = 0;
    public int countNodes(TreeNode root) {
        preorderTraversal(root);
        return count;
    }
    public void preorderTraversal(TreeNode root) {
        if (root == null) return;
        count++;
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

}
