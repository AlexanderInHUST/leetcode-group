package algorithms;

import base.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by tangyifeng on 17/2/6.
 * Email: yifengtang_hust@outlook.com
 */
public class FindNodeInBST_501 {

    private int maxCount = 0;
    private int curCount = 0;
    private int curValue = 0;
    private ArrayList<Integer> modes;

    public int[] findMode(TreeNode root) {
        modes = new ArrayList<>();
        findMaxValue(root);
        modes = new ArrayList<>();
        curCount = 0;
        curValue = 0;
        findMaxValue(root);
        int[] result = new int[modes.size()];
        for(int i = 0; i < result.length; i++) {
            result[i] = modes.get(i);
        }
        return result;
    }

    public void findMaxValue(TreeNode node) {
        if(node == null)
            return;
        findMaxValue(node.left);
        if(node.val != curValue) {
            curValue = node.val;
            curCount = 0;
        }
        curCount ++;
        if(curCount > maxCount) {
            maxCount = curCount;
        } else if(curCount == maxCount) {
            modes.add(curValue);
        }
        findMaxValue(node.right);
    }
}
