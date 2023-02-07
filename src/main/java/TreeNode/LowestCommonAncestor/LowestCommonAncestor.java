package main.java.TreeNode.LowestCommonAncestor;

import main.java.TreeNode.TreeNode;

//https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
//235. Lowest Common Ancestor of a Binary Search Tree
public class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if (p.val < root.val && q.val< root.val){
            return lowestCommonAncestor(root.left, p, q);
        } else if (p.val > root.val && q.val> root.val){
            return lowestCommonAncestor(root.right, p, q);
        }
        return root;

    }
}
