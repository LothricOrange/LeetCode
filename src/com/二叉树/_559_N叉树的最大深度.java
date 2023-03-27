package com.二叉树;

import java.util.Iterator;
import java.util.List;

public class _559_N叉树的最大深度 {

    public int maxDepth(Node root) {
        if (root == null) return 0;
        if (root.children == null) return 1;
        Iterator<Node> it = root.children.iterator();
        int max = 0;
        while (it.hasNext()) {
            max = Math.max(maxDepth(it.next()), max);
        }
        return max + 1;
    }

    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
}
