package leetCodeA.leetCode75.第6天;


import java.util.ArrayList;
import java.util.List;

public class _589_N叉树的前序遍历 {
    List<Integer> list = new ArrayList<>();
    public List<Integer> preorder(Node root) {
        if (root == null) return list;
        helper(root);
        return list;
    }

    public void helper(Node node) {
        if (node == null) return;
        list.add(node.val);
        for (Node n : node.children) {
            helper(n);
        }
    }



    private class Node {
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
    };

}
