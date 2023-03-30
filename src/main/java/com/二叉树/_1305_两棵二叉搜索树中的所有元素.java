package com.二叉树;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _1305_两棵二叉搜索树中的所有元素 {

    ListNode node1;
    ListNode node2;

    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> result = new ArrayList<>();

        return result;
    }

    public ListNode inorderTraversal(TreeNode root) {
        if (root == null) return null;
        inorderTraversal(root.left);

        inorderTraversal(root.right);
        return null;
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.val > l2.val) {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        } else {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }
    }

    private class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    List<Integer> ans = new ArrayList<>();

    public List<Integer> getAllElements2(TreeNode root1, TreeNode root2) {
        addNum(root1);
        addNum(root2);
        Collections.sort(ans);
        return ans;
    }

    public void addNum(TreeNode t) {
        if (t == null) {
            return;
        }
        ans.add(t.val);
        addNum(t.left);
        addNum(t.right);
    }
}
