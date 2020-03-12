package com.jason.algorithm.leetcode;

import com.jason.algorithm.leetcode.base.TreeNode;

/**
 * Created by jsson on 20/2/29.
 */
public class CountCompleteTreeNodes222 {
    public int countNodes(TreeNode root) {
        if (root == null) return 0;

        int leftHight = lengthHight(root.left);
        int rightHight = rightHight(root.right);

        if (leftHight == rightHight) {
            // 返回三部分的和：
            // 1 为当前根节点
            // (1<<leftLeft) - 1 为当前根节点的左子树（一棵满二叉树）的节点个数
            //                   注意，我们之前已经求出来了，这课满二叉树的告诉为leftLeft
            // 递归计算当前根节点右子树的节点数：countNodes(root->right)
            return 1 + (1 << leftHight - 1) + countNodes(root.right);
        }

        // 此时，由于是完全二叉树，当前根节点的右子树的高度，肯定也是leftRight，
        // 返回三部分的和：
        // 1 为当前根节点
        // (1<<leftRight) - 1 为当前根节点的右子树（也是一棵满二叉树）的节点个数
        // 递归计算当前根节点左子树的节点数：countNodes(root->left)
        return 1+ (1 << rightHight -1) + countNodes(root.left);
    }

    private int rightHight(TreeNode right) {
        if (right == null) {
            return 0;
        }

        return 1 + lengthHight(right.right);
    }

    private int lengthHight(TreeNode left) {
        if (left == null) {
            return 0;
        }

        return 1 + lengthHight(left.left);
    }
}
