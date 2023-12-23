package org.leetcode.cimple;

import org.junit.Test;
import org.leetcode.utils.TreeNode;

// 路径总和
public class HasPathSum {
    private boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        int sum = 0;
        return helper(root, sum, targetSum);

    }

    private boolean helper(TreeNode root, int sum, int targetSum) {
        if (root == null) {
            return false;
        }
        if ((sum = sum + root.val) == targetSum && root.left == null && root.right == null) {
            return true;
        }
        if (helper(root.left, sum, targetSum)) {
            return true;
        }
        if (helper(root.right, sum, targetSum)) {
            return true;
        }
        sum -= root.val;
        return false;
    }

    @Test
    public void test() {
//        TreeNode root = new TreeNode(5, new TreeNode(4, new TreeNode(11, new TreeNode(7), new TreeNode(2)), null), new TreeNode(8, new TreeNode(13), new TreeNode(4, null, new TreeNode(1))));
        TreeNode root = new TreeNode(1,new TreeNode(2),null);
        int targetSum = 2;
        System.out.println(hasPathSum(root, targetSum));
    }
}
