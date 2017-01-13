package algorithms;

/**
 * Created by tangyifeng on 17/1/12.
 * Email: yifengtang@uniquestudio.com
 */
public class MoveZeros {

    public static void main(String args[]) {
        int nums[] = new int[]{0, 1};
        new MoveZeros().moveZeroes(nums);
        for(int i : nums)
            System.out.println(i);
    }

    public void moveZeroes(int[] nums) {
        int m = 0, n = 0;
        for(m = 0; m < nums.length; m++){
            if(nums[m] == 0) {
                while(nums[n] == 0) {
                    if(n == nums.length - 1)
                        return;
                    else
                        n++;
                }
                int temp = nums[m];
                nums[m] = nums[n];
                nums[n] = temp;
            } else {
                if(n <= m) {
                    n = m;
                    n++;
                }
            }
        }
    }
}
