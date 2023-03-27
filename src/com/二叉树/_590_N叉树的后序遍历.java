package com.二叉树;

import java.util.*;

public class _590_N叉树的后序遍历 {
    public List<Integer> postorder(Node root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        Deque<Node> deque = new LinkedList<>();
        Node node = root;
        deque.push(node);
        while (!deque.isEmpty()) {
            node = deque.peek();
            if (node != null) {
                deque.push(null);

                for (int i = node.children.size() - 1; i >= 0; i--) {
                    deque.push(node.children.get(i));
                }
            } else {
                deque.pop();
                node = deque.pop();
                list.add(node.val);
            }

        }
        return list;
    }

    //递归
    List<Integer> list = new ArrayList<>();
    public List<Integer> postorder2(Node root) {
        postTraversal(root);
        return list;
    }

    public void postTraversal(Node node) {
        if (node == null) return;
        int size = node.children.size();
        for (int i = 0; i < size; i++) {
            postorder(node.children.get(i));
        }
        list.add(node.val);
    }

}
