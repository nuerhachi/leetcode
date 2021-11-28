package before;

import java.util.*;

public class 从上到下打印二叉树 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();

        Deque<TreeNode> deque = new LinkedList<>();
        if (root != null) deque.add(root);
        while (!deque.isEmpty()) {
            List<Integer> data = new ArrayList<>();

            for (int i = deque.size(); i >0; i--) {
                TreeNode p = deque.pop();
                data.add(p.val);
                if (p.left != null)
                    deque.add(p.left);
                if (p.right != null)
                    deque.add(p.right);
            }
            res.add(data);
        }
        return res;
    }

    public static void main(String args[]) {

    }
}
