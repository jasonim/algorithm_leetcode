package com.jason.algorithm.leetcode;

import com.jason.algorithm.leetcode.base.TreeNode;

/**
 * Created by jsson on 20/5/24.
 */
public class MiniDepthTree111 {
    int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return 1;
        }

        int ret = 2^31;
        if (root.left != null) {
            ret = Math.min(ret, minDepth(root.left) + 1);
        }

        if (root.right != null) {
            ret = Math.min(ret, minDepth(root.right) + 1);
        }

        return ret;
    }
}
