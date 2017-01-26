package algorithms;

/**
 * Created by tangyifeng on 17/1/26.
 * Email: yifengtang_hust@outlook.com
 */
public class MaxConsecutiveOnes_485 {

    public static void main(String args[]) {
        System.out.println(new MaxConsecutiveOnes_485().findMaxConsecutiveOnes(new int[]{1,1,1,1,0,1}));
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                nums[i] = ++count;
            } else {
                count = 0;
            }
        }
        int max = 0;
        for(int i : nums) {
            if(i > max)
                max = i;
        }
        return max;
    }
}
