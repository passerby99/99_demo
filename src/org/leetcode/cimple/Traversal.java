package org.leetcode.cimple;

import org.junit.Test;
import org.leetcode.utils.TreeNode;
import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;


public class Traversal {
    List<Integer> list = new ArrayList<>();
    // 二叉树的前序遍历
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null) {
            return list;
        }
        list.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return list;
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        if(root == null) {
            return list;
        }
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        list.add(root.val);
        return list;
    }
    @Test
    public void test() {
        TreeNode root = new TreeNode(1, null,new TreeNode(2, new TreeNode(3), null));
        System.out.println(postorderTraversal(root));
    }
}
