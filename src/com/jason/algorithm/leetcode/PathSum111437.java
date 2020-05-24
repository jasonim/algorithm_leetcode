package com.jason.algorithm.leetcode;

import com.jason.algorithm.leetcode.base.TreeNode;

/**
 * Created by jsson on 20/3/1.
 * 437. Path Sum III
 Easy

 2745

 205

 Add to List

 Share
 You are given a binary tree in which each node contains an integer value.

 Find the number of paths that sum to a given value.

 The path does not need to start or end at the root or a leaf, but it must go downwards (traveling only from parent nodes to child nodes).

 The tree has no more than 1,000 nodes and the values are in the range -1,000,000 to 1,000,000.

 Example:

 root = [10,5,-3,3,2,null,11,3,-2,null,1], sum = 8

 10
 /  \
 5   -3
 / \    \
 3   2   11
 / \   \
 3  -2   1

 Return 3. The paths that sum to 8 are:

 1.  5 -> 3
 2.  5 -> 2 -> 1
 3. -3 -> 11
 */
public class PathSum111437 {
    public int pathSum(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }

        int res = findPath(root, sum);
        res += pathSum(root.left, sum);
        res += pathSum(root.right, sum);

        return res;
    }

    /**
     * 在node得为根节点的二叉树中, 寻找包含node 的路径, 和为sum
     * 返回这样路径个数
     * @param node
     * @param sum
     * @return
     */
    private int findPath(TreeNode node, int sum) {
        if (node == null) {
            return 0;
        }

        int res = 0;
        if (node.val == sum) {
            res += 1;
        }

        res += findPath(node.left, sum - node.val);
        res += findPath(node.right, sum - node.val);
        return res;
    }
}
