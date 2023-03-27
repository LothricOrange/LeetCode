package leetCodeA.数据结构基础.第15天_树;

public class _108_将有序数组转换为二叉搜索树 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return merge(nums, 0, nums.length);
    }

    public TreeNode merge(int[] nums, int begin, int end) {
        if (begin == end) return null;
        int mid = (begin + end) >> 1;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = merge(nums, begin, mid);
        node.right = merge(nums, mid + 1, end);
        return node;
    }
}
