package org.leetcode.cimple;

public class IsSameTree {
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

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if ((p != null && q == null) || (p == null && q != null)) {
            return false;
        }
        if (p == null && q == null) {
            return true;
        }
        if (q.val == p.val) {
            if (isSameTree(p.left, q.left)) {
               if (isSameTree(p.right, q.right)) {

               } else {
                   return false;
               }
            } else {
                return false;
            }

        } else {
            return false;
        }
        return true;
    }
}
