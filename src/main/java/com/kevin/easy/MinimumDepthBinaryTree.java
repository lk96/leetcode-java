package com.kevin.easy;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author: kai Li
 * Date: 2021/3/18 11:19
 * @Description: 二叉树的最小深度
 * 给定一个二叉树，找出其最小深度。
 * <p>
 * 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
 * <p>
 * 说明：叶子节点是指没有子节点的节点。
 */
public class MinimumDepthBinaryTree {

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3, new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        System.out.println(minDepth(treeNode));
    }

    public static int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int steps = 1;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                TreeNode remove = queue.remove();
                if (remove.left == null && remove.right == null) {
                    return steps;
                }
                if (remove.left != null) {
                    queue.add(remove.left);
                }
                if (remove.right != null) {
                    queue.add(remove.right);
                }
            }
            steps++;
        }
        return steps;
    }

    static class TreeNode {
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
}
