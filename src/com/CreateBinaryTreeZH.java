package com;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateBinaryTreeZH {
    public static List<Integer> list = new ArrayList<>();

    public static List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) return list;
        list.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return list;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    private static int find(char[] array, int v) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == v) {
                return i;
            }
        }
        return -1;
    }

    private static TreeNode buildTree(char[] inorder, char[] postorder) {

        if (postorder.length == 0) {
            return null;
        }

        //1、根据后序，找到根的值，并且创建根节点
        char rootValue = postorder[postorder.length - 1];
        TreeNode root = new TreeNode(rootValue);

        //2、在中序中找到根的值所在的下标
        int leftSize = find(inorder, rootValue);

        //3、切出左子树的中序和后序
        char[] leftInorder = Arrays.copyOfRange(inorder, 0, leftSize);
        char[] leftPostorder = Arrays.copyOfRange(postorder, 0, leftSize);
        root.left = buildTree(leftInorder, leftPostorder);

        //4、切出右子树的中序和后序
        char[] rightInorder = Arrays.copyOfRange(inorder, leftSize + 1, inorder.length);
        char[] rightPostorder = Arrays.copyOfRange(postorder, leftSize, postorder.length - 1);
        root.right = buildTree(rightInorder, rightPostorder);

        return root;
    }


    public static void main(String[] args) {
        char[] inorder = new char[]{'D', 'G', 'B', 'A', 'E', 'C', 'H', 'F'};
        char[] postorder = new char[]{'G', 'D', 'B', 'E', 'H', 'F', 'C', 'A'};
        TreeNode root = buildTree(inorder, postorder);
        System.out.println("创建成功");
        preorderTraversal(root);
        for (int num : list) {
            char c = (char) num;
            System.out.println(c);
        }

        System.out.println(measure(33, 44));
    }

    static int measure(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
}
