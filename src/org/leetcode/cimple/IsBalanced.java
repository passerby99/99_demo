package org.leetcode.cimple;


import org.junit.Test;
import org.leetcode.utils.TreeNode;

// 平衡二叉树
public class IsBalanced {
    int max = 0;

    public Boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int high = 0;

        return helper(root, high) > 0;
    }

    private int helper(TreeNode root, int high) {
        if (root == null) {
            return 0;
        }
        high++; // 只要不为空，深度加一
        int leftHeight = helper(root.left, high); // 遍历左子树
        int rightHeight = helper(root.right, high); // 遍历右子树
        if (leftHeight == -1 || rightHeight == -1) {
            return -1;
        }
        if (leftHeight != 0) {
            if (rightHeight != 0) {
                if (Math.abs(leftHeight - rightHeight) > 1) {
                    return -1;
                }
            } else {
                if (Math.abs(leftHeight - high) > 1) {
                    return -1;
                }
            }

        } else {
            if (rightHeight != 0) {
                if (Math.abs(high - rightHeight) > 1) {
                    return -1;
                }
            } else {
                return high;
            }
        }
        return Math.max(leftHeight, rightHeight);
    }


    @Test
    public void test() {
//        TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
//        TreeNode root = new TreeNode(1, null, new TreeNode(2, null, new TreeNode(3)));
//        TreeNode root = new TreeNode(1,new TreeNode(2, new TreeNode(3, new TreeNode(4), new TreeNode(4)), new TreeNode(3)), new TreeNode(2));
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4, new TreeNode(8), null), new TreeNode(5)), new TreeNode(3, new TreeNode(6), null));
        System.out.println(isBalanced(root));
    }
}
