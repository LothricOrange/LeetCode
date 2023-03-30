package leetCodeA.数据结构基础.第15天_树;

import java.util.HashMap;

public class _105_从前序与中序遍历序列构造二叉树 {
    HashMap<Integer, Integer> map = new HashMap<>();
    int index = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return merge(0, preorder.length, preorder);
    }

    public TreeNode merge(int begin, int end, int[] preorder) {
        if (begin < end) {
            TreeNode root = new TreeNode(preorder[index]);
            int rootIndex = map.get(preorder[index]);
            index++;
            root.left = merge(begin, rootIndex, preorder);
            root.right = merge(rootIndex + 1, end, preorder);
            return root;
        }
        return null;
    }


}
