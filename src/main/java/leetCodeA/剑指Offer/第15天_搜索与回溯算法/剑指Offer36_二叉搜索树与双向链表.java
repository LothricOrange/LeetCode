package leetCodeA.剑指Offer.第15天_搜索与回溯算法;

import java.util.ArrayList;
import java.util.List;

public class 剑指Offer36_二叉搜索树与双向链表 {
    public Node treeToDoublyList(Node root) {
        if (root == null) return null;
        List<Node> list = new ArrayList<>();
        inorderTraversal(root, list);
        int size = list.size();
        Node first = list.get(0);
        Node last = list.get(size - 1);
        first.right = last;
        last.left = first;
        Node head = first;

        Node prev = first;
        for (int i = 1; i < size - 1; i++) {
            Node node = list.get(i);
            node.right = prev;
            prev = node;
            node.left = list.get(i + 1);
        }


        return head;
    }

    public List<Node> inorderTraversal(Node root, List<Node> list) {
        if (root == null) return list;
        inorderTraversal(root.left, list);
        list.add(root);
        inorderTraversal(root.right, list);
        return list;
    }

    class Node {
        public int val;
        public Node left;
        public Node right;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val,Node _left,Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }
    };
}
