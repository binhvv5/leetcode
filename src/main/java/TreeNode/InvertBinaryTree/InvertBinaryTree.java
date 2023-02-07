package main.java.TreeNode.InvertBinaryTree;

import main.java.TreeNode.TreeNode;

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return root;
        }
        invertTree(root.right);
        invertTree(root.left);
        TreeNode temp = null;
        temp = root.left;
        root.left = root.right;
        root.right = temp;
        return root;
    }

}
