package com.jason.algorithm.leetcode;

import com.jason.algorithm.leetcode.base.TreeNode;

/**
 * Created by jsson on 20/6/9.
 */
public class ReverseBinaryTree {
    public TreeNode reverseBinaryTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        if (root.left == null && root.right == null) {
            return root;
        }

        root.left = reverseBinaryTree(root.left);
        root.right = reverseBinaryTree(root.right);
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        return root;
    }
}
