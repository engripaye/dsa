package org.engripaye.TreesAndGraph;

import com.sun.source.tree.Tree;
import org.engripaye.Node.TreeNode;

public class LowestCommonAncestor {

    // in a family tree, derived the middle of any branch then you get your lca


    public static TreeNode findLCA(TreeNode root, TreeNode x, TreeNode y) {
        if (root == null) return  null;

        if (x.val < root.val && y.val < root.val) {
            return findLCA(root.left, x, y); // go left
        }else if (x.val > root.val && y.val > root.val) {
            return findLCA(root.right, x, y); // go right
        }else {
            return root; // split happens here this is the lca
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(8);
        root.left.left =new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(9);

        TreeNode x = root.left.left; // node 2
        TreeNode z = root.left.right; // node 4

        TreeNode lca = findLCA(root, x, z);
        System.out.println(STR."LCA: \{lca.val}"); // output 3
    }
}
