package algorithms;

/**
 * Created by tangyifeng on 17/1/26.
 * Email: yifengtang_hust@outlook.com
 */
public class MissingNumber_268 {

    public static void main(String[] args) {
        System.out.println(new MissingNumber_268().missingNumber(new int[]{4,3,1,0}));
    }

    public int missingNumber(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            if(i != nums[i]) {
                int value = nums[i];
                if(value != nums.length) {
                    int temp = nums[i];
                    nums[i] = nums[value];
                    nums[value] = temp;
                    i--;
                }
            }
        }
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != i)
                return i;
        }
        return nums.length;
    }
}
