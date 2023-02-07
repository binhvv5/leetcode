package main.java.TreeNode.MaximumDept;

import main.java.TreeNode.TreeNode;
//https://leetcode.com/explore/featured/card/top-interview-questions-easy/94/trees/555/
public class MaximumDepth {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right) + 1;
    }
}
