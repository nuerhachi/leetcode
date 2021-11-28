package before;

import java.util.ArrayList;
import java.util.List;

public class 二叉搜索树的第k大的节点 {
int k,res;
    public int kthLargest(TreeNode root, int k) {
        this.k=k;
       inOrder(root);
        return res;
    }

    private void inOrder(TreeNode root) {
        if (root != null)
        { inOrder(root.right);
        if (--k==0) res= root.val;
        inOrder(root.left);
        }
    }

    public static void main(String args[]) {


    }
}
