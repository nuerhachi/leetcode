package before;

public class 二叉树的镜像 {



    public TreeNode mirrorTree(TreeNode root) {
        if(root==null)
            return null;
        else
        {


            TreeNode temp= mirrorTree(root.left);;
            root.left=mirrorTree(root.right);
            root.right=temp;

            return root;}
    }

}
