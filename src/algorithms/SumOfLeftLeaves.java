package algorithms;

/**
 * Created by tangyifeng on 17/1/9.
 * Email: yifengtang@uniquestudio.com
 */
public class SumOfLeftLeaves {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public int sumOfLeftLeaves(TreeNode root) {
        return getSum(root, false);
    }

    private int getSum(TreeNode node, boolean isLeft){
        if(node == null)
            return 0;
        if(node.left == null && node.right == null){
            if(isLeft)
                return node.val;
            else
                return 0;
        }
        return getSum(node.left, true) + getSum(node.right, false);
    }
}
