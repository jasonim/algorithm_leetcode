package com.jason.algorithm.leetcode;

import com.jason.algorithm.leetcode.base.TreeNode;

/**
 * Created by jsson on 20/6/9.
 */
public class MaximuzDepthofBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return 1;
        }

        int ret = 0;

        if (root.left != null) {
            ret = Math.max(ret, maxDepth(root.left) + 1);
        }

        if (root.right != null) {
            ret = Math.max(ret, maxDepth(root.right) + 1);
        }

        return  ret;
    }
}
