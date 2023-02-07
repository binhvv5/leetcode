package main.java.TreeNode.ValidateBinary;

import main.java.TreeNode.TreeNode;

import java.util.Stack;

//https://leetcode.com/explore/featured/card/top-interview-questions-easy/94/trees/625/
public class ValidateBST {
    public TreeNode prev;

    public boolean isValidBST(TreeNode root) {
        if (root==null) return true;
        if (!isValidBST(root.left)) return false;

        if (prev != null && prev.val >= root.val)
            return false;
        prev = root;
        if (!isValidBST(root.right))
            return false;
        return true;

    }

}
