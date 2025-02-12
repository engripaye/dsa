package org.engripaye.TreesAndGraph;

import org.engripaye.Node.TreeNode;

public class BinaryTreeInorderTraversal {

    // binary tree node in specific order

    public static void inOrder(TreeNode root) {
        if(root == null) return; // base case: stop if tree is empty

        inOrder(root.left); // visit left subtree

        System.out.print(STR."\{root.val}"); // visit root(print value)

        inOrder(root.right);  // visit the subtree
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        inOrder(root);
        // output 12345
    }
}
