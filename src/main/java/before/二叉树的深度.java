package before;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class 二叉树的深度 {
//层次
   /* public int maxDepth(TreeNode root) {
        if (root!=null)
        {  Deque<TreeNode> deque = new LinkedList<>();
            deque.add(root);
            int count = 0;
            while (!deque.isEmpty()) {
                System.out.print( deque.size());

                for (int i = deque.size(); i >0; i--) {
                    TreeNode p =deque.pop();
                    if (p.left != null) deque.add(p.left);
                    if (p.right != null) deque.add(p.right);
                }
                ++count;
            }
            return count;}
        return 0;
    }*/
   //后序
public int maxDepth(TreeNode root) {
    return root==null?0:Math.max(maxDepth(root.left),maxDepth(root.right   ))+1;
}

    public static void main(String args[]) {

    }
}
