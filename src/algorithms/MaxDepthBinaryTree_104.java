package algorithms;

/**
 * Created by tangyifeng on 16/12/27.
 * Email: yifengtang@uniquestudio.com
 */
public class MaxDepthBinaryTree_104 {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    private int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
