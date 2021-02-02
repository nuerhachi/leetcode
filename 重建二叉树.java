package com.wencongxiao.leetcode;

public class 重建二叉树 {

    static int count=0;
      public static class TreeNode {
          int val;
           TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
     }


        public static TreeNode buildTree(int[] preorder, int[] inorder) {

          int start,end;
          start=0;
          end=inorder.length-1;
        return   myBuildTree( preorder,  inorder,start,end);

        }

    private static TreeNode myBuildTree(int[] preorder, int[] inorder, int start, int end) {
        if (end-start<0)
            return null;
        else
        {
            int root=preorder[count++];
            TreeNode res=new TreeNode(root);
            int i=start;
            while (inorder[i]!=root) i++ ;
            res.left=myBuildTree(preorder,inorder,start,i-1);
            res.right=myBuildTree(preorder,inorder,i+1,end);

            return res;}
    }

    public static void main(String args[]) {
int[] pre={3,9,20,15,7};
int[] in={9,3,15,20,7};
buildTree(pre,in);

    }
}
