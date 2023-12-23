package org.leetcode.cimple;

import org.junit.Test;
import org.leetcode.utils.TreeNode;

// 二叉树的最小深度
public class MinDepth {

    private int min = 0;
    private int high = 0;

    private int minDepth(TreeNode root) {
       if(root == null) {
           return 0;
       }
       high++;
       int leftNumber = minDepth(root.left);
       int rightNumber = minDepth(root.right);
       if(leftNumber==0 && rightNumber == 0) {
           if(min == 0) {
               min = high;
           }
           min = Math.min(high, min);
           high--;
           return min;
       }
       high--;
       return min;
    }
    @Test
    public void test() {
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4, new TreeNode(8), null), new TreeNode(5)), new TreeNode(3, new TreeNode(6), null));
        System.out.println(minDepth(root));
    }
}
