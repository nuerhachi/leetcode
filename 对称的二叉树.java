package com.wencongxiao.leetcode;

public class 对称的二叉树 {
    public boolean isSymmetric(TreeNode root) {

        return root==null?true:compare(root.left,root.right);
    }

    private boolean compare(TreeNode left, TreeNode right) {
        if (left==null&&right==null)
            return true;
        if (left==null||right==null||left.val!=right.val)
            return false;
        return compare(left.left,right.right)&&compare(left.right,right.left);}

    public static void main(String args[]) {


    }
}
