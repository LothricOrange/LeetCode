package leetCodeA.算法入门.第8天_广度优先搜索OR深度优先搜索;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class _116_填充每个节点的下一个右侧节点指针 {
    /*public Node connect(Node root) {
        if (root == null) return null;
        int levelSize = 1;
        Queue<Node> queue1 = new LinkedList<>();
        Queue<Node> queue2 = new LinkedList<>();
        queue1.offer(root);
        root.next = null;
        while (!queue1.isEmpty()) {
            Node node = queue1.poll();
            levelSize--;

            if (node.left != null) {
                queue1.offer(node.left);
                queue2.offer(node.left);
            }
            if (node.right != null) {
                queue1.offer(node.right);
                queue2.offer(node.right);
            }
            if (levelSize == 0) {
                levelSize = queue1.size();
                while (!queue2.isEmpty()) {
                    queue2.poll().next = queue2.peek();
                }
            }
        }
        return root;
    }*/
    public Node connect(Node root) {
        if (root == null) return null;
        if (root.left == null) return root;
        root.left.next = root.right;
        if (root.next != null) {
            root.right.next = root.next.left;
        }
        connect(root.left);
        connect(root.right);
        return root;
    }
}

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}
