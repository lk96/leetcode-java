package com.kevin.easy.string;

/**
 * @Author: kai Li
 * Date: 2021/4/8 17:05
 * @Description: 根据二叉树创建字符串
 * 你需要采用前序遍历的方式，将一个二叉树转换成一个由括号和整数组成的字符串。
 * <p>
 * 空节点则用一对空括号 "()" 表示。而且你需要省略所有不影响字符串与原始二叉树之间的一对一映射关系的空括号对。
 */
public class ConstructStringBinaryTree {

    public static void main(String[] args) {

    }

    public static String tree2str(TreeNode t) {
        StringBuilder builder = new StringBuilder();
        helper(t, builder);
        return builder.toString();
    }

    private static void helper(TreeNode t, StringBuilder builder) {
        if (t == null) {
            return;
        }
        builder.append(t.val);
        if (t.left == null && t.right == null) {
            return;
        }
        builder.append("(" );
        helper(t.left, builder);
        builder.append(")" );
        if (t.right != null) {
            builder.append("(" );
            helper(t.right, builder);
            builder.append(")" );
        }
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}