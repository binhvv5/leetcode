package main.java.TreeNode.BalancedTree;

import main.java.TreeNode.TreeNode;

//https://leetcode.com/problems/balanced-binary-tree/
//110. Balanced Binary Tree
public class BalancedTree {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        } else if (Math.abs(height(root.left) - height(root.right)) > 1) {
            return false;
        } else {
            return isBalanced(root.left) && isBalanced(root.right);
        }
    }

    public static int height(TreeNode root){
        if(root == null){
            return 0;
        }
        int lheight = height(root.left);
        int rheight = height(root.right);
        return Math.max(lheight,rheight)+1;
    }
}
