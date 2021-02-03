package com.wencongxiao.leetcode;

public class 平衡二叉树 {

    public boolean isBalanced(TreeNode root) {
        if (root==null) return true;
        return Math.abs(maxDepth(root.left)-maxDepth(root.right))<=1&&isBalanced(root.left)&&isBalanced(root.right)?true:false;
    }
    public int maxDepth(TreeNode root) {
        return root==null?0:Math.max(maxDepth(root.left),maxDepth(root.right   ))+1;
    }
    public static void main(String args[]) {


    }
}
