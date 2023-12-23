package org.leetcode.cimple;

public class MaxDepth {
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
    private int max = 0;
    private int k = 0;

    public int maxDepth(TreeNode root) {
        if(root != null) {
            k++;
            max = maxDepth(root.left);
            max = maxDepth(root.right);
            max = Math.max(k,max);
            k--;
            return max;
        }
        return max;
    }
    public int run() {
       TreeNode root = new TreeNode(3, new TreeNode (9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
       return maxDepth(root);
    }
}
