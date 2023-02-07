package main.java.TreeNode.SameTree;

import main.java.TreeNode.TreeNode;
//https://leetcode.com/problems/same-tree/solutions/
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {

        if (p== null && q==null) return true;
        if (q == null || p==null) return false;
        if (p.val != q.val) return false;
        else{
            boolean left = isSameTree(p.left, q.left);
            boolean right = isSameTree(p.right, q.right);
            return left && right;
        }
    }
}
