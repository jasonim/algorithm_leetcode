package com.jason.algorithm.leetcode;

import com.jason.algorithm.leetcode.base.TreeNode;

import java.util.Stack;

/**
 * Created by jsson on 20/2/29.
 */
public class PreorderTravesal {
    public void inOrderTravesal(TreeNode root) {
        Stack<Command> stack = new Stack<>();

        stack.push(new Command(ECommand.GO, root));
        while (stack.size() > 0) {
            Command top = stack.pop();
            if (top.command == ECommand.PRINT) {
                System.out.println(top.node.val);
            } else {
                if (top.node.right != null) {
                    stack.push(new Command(ECommand.GO, top.node.right));
                }

                stack.push(new Command(ECommand.PRINT, top.node));

                if (top.node.left != null) {
                    stack.push(new Command(ECommand.GO, top.node.left));
                }
            }

        }
    }

    enum ECommand {
        GO,
        PRINT
    }
    private class Command {
        ECommand command;
        TreeNode node;

        Command(ECommand command, TreeNode node) {
            this.command = command;
            this.node = node;
        }
    }
}
