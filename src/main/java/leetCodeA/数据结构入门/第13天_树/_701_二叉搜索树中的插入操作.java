package leetCodeA.数据结构入门.第13天_树;

public class _701_二叉搜索树中的插入操作 {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            root = new TreeNode(val, null, null);
            return root;
        }
        TreeNode node = root;
        TreeNode parent = root;
        int compare = 0;
        while (node != null) {
            compare = val - node.val;
            parent = node;
            if (compare > 0) {
                node = node.right;
            } else if (compare < 0) {
                node = node.left;
            } else {
                return root;
            }
        }
        TreeNode newNode = new TreeNode(val, null, null);
        if (compare > 0) {
            parent.right = newNode;
        } else {
            parent.left = newNode;
        }
        return root;
    }
}
