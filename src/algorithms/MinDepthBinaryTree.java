package algorithms;

/**
 * Created by tangyifeng on 16/12/27.
 * Email: yifengtang@uniquestudio.com
 */
public class MinDepthBinaryTree {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public int minDepth(TreeNode root) {
        if(root == null)
            return 0;
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        if(left == 0 && right == 0)
            return 1;
        return Math.min((left == 0) ? Integer.MAX_VALUE : left, (right == 0) ? Integer.MAX_VALUE : right) + 1;
    }
}
