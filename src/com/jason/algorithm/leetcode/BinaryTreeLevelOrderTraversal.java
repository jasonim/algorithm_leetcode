package com.jason.algorithm.leetcode;

import com.jason.algorithm.leetcode.base.TreeNode;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by jsson on 20/6/9.
 */
public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        if(root == null)
            return res;

        LinkedList<Pair<TreeNode, Integer>> queue = new LinkedList<>();
        queue.addLast(new Pair<>(root, 0));

        while(!queue.isEmpty()){

            Pair<TreeNode, Integer> front = queue.removeFirst();
            TreeNode node = front.getKey();
            int level = front.getValue();

            if(level == res.size())
                res.add(new ArrayList<Integer>());
            assert level < res.size();

            res.get(level).add(node.val);
            if(node.left != null)
                queue.addLast(new Pair<>(node.left, level + 1));
            if(node.right != null)
                queue.addLast(new Pair<>(node.right, level + 1));
        }

        return res;
    }
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        
        if(root == null) {
            return res;
        }
        
        LinkedList<Pair<TreeNode, Integer>> queue = new LinkedList<>();
        
        queue.addLast(new Pair<>(root, 0));
        
        while(!queue.isEmpty()) {
            Pair<TreeNode, Integer> front = queue.removeFirst();
            TreeNode node = front.getKey();
            int level = front.getValue();
            
            
            if (level == res.size()) {
                res.add(new ArrayList<Integer>); 
            }
            
            res.get(level).add(node.val);
            
            if (node.left != null) {
                queue.addList(new Pair<>(node.left, level + 1))};
            }
            
            if (node.right != null) {
                queue.addList(new Pair<>(node.right, level + 1));
            }
        }
    
        return res;
    }
}
