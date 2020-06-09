package com.jason.algorithm.leetcode;

import com.jason.algorithm.leetcode.base.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by jsson on 20/6/9.
 */
public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) {
            return result;
        }
        Queue<TreeNode> level = new LinkedList<>();
        List<Integer> levelByLevel = new ArrayList<>();
        level.add(root);
        while(!level.isEmpty()) {
            TreeNode temp = level.poll();
            if(temp == null) {
                result.add(levelByLevel);
                levelByLevel = new ArrayList<>();
                if(level.isEmpty()) {
                    break;
                }
                level.offer(null);
                continue;
            }
            levelByLevel.add(temp.val);
            if(temp.left != null) {
                level.offer(temp.left);
            }
            if(temp.right != null) {
                level.offer(temp.right);
            }
        }
        return result;
    }
}
