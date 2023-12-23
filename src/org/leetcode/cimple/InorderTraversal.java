package org.leetcode.cimple;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversal {
    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    List<Integer> list = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            list.add(root.val);
            inorderTraversal(root.right);
        }
        return list;
    }

    public List<Integer> run() {
        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        List list = inorderTraversal(root);
        return list;
    }
}
