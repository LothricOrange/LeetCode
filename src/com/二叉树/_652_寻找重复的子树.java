package com.二叉树;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _652_寻找重复的子树 {
    List<TreeNode> ans = new ArrayList<>();
    Map<String, Integer> map = new HashMap<>();
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        dfs(root);
        return ans;
    }

    public String dfs(TreeNode node) {
        if (node == null) return "?";
        String str = node.val + " " + dfs(node.left) + " " + dfs(node.right);
        Integer count = map.get(str);
        if (count != null) {
            if (count == 1) ans.add(node);
            map.put(str, count + 1);
        } else {
            map.put(str, 1);
        }
        return str;
    }
}
