package algorithms;

/**
 * Created by tangyifeng on 17/1/12.
 * Email: yifengtang@uniquestudio.com
 */
public class SameTree_100 {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null)
            return true;
        if(p == null || q ==null){
            return false;
        }
        return (p.val == q.val) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

}
