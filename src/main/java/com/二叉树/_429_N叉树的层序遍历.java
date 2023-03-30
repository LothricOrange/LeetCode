package com.二叉树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _429_N叉树的层序遍历 {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) return list;
        List<Integer> sonList = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int levelSize = 1;
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            if (levelSize > 0) {
                sonList.add(node.val);
            }
            levelSize--;
            if (node.children == null) continue;
            for (Node n : node.children) {
                queue.offer(n);
            }
            if (levelSize == 0) {
                levelSize = queue.size();
                list.add(sonList);
                sonList = new ArrayList<>();
            }
        }
        return list;
    }

    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List _children) {
            val = _val;
            children = _children;
        }
    }
}


