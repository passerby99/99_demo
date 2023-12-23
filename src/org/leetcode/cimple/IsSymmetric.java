package org.leetcode.cimple;

public class IsSymmetric {
    // 对称二叉树
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

    public boolean run() {
        TreeNode root = new TreeNode(1, new TreeNode(2, null, new TreeNode(3)), new TreeNode(2, null, new TreeNode(3)));
        return isSymmetric(root);
    }

    public boolean isSymmetric(TreeNode root) {
        TreeNode left = root.left;
        TreeNode right = root.right;
        return symmetric(left, right);

    }

    private boolean symmetric(TreeNode leftNode, TreeNode rightNode) {
        if ((leftNode != null && rightNode == null) || (leftNode == null && rightNode != null)) {
            return false;
        }
        if (leftNode == null && rightNode == null) {
            return true;
        }
        if (leftNode.val != rightNode.val) {
            return false;
        }
        if(symmetric(leftNode.left, rightNode.right)) {

        } else {
            return false;
        }
       if(symmetric(leftNode.right, rightNode.left)) {

       } else {
           return false;
       }



        return true;
    }
}
