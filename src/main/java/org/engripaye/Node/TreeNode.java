package org.engripaye.Node;

import com.sun.source.tree.Tree;

public class TreeNode {

    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}
