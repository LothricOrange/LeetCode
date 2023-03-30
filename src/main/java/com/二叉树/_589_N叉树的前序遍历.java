package com.二叉树;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _589_N叉树的前序遍历 {
    public List<Integer> preorder2(Node root) {
        List<Integer> list = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        if (root == null) return list;
        stack.add(root);
        while (!stack.isEmpty()) {
            Node node = stack.pop();
            list.add(node.val);
            for (int i = node.children.size() - 1; i >= 0; i--) {
                stack.add(node.children.get(i));
            }

        }
        return list;
    }

    List<Integer> list = new ArrayList<>();
    public List<Integer> preorder(Node root) {
        preorderTraversal(root);
        return list;
    }

    public void preorderTraversal(Node node) {
        if (node == null) return;
        list.add(node.val);
        int size = node.children.size();
        for (int i = 0; i < size; i++) {
            preorderTraversal(node.children.get(i));
        }
    }
}


class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
