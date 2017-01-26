package algorithms;

/**
 * Created by tangyifeng on 16/12/27.
 * Email: yifengtang@uniquestudio.com
 */
public class FindSingleNum_136 {

    public static void main(String args[]){
        System.out.println(new FindSingleNum_136().singleNumber(new int[]{1,1,2,2,3}));
    }

    private int singleNumber(int[] nums) {
        for(int i = 1; i < nums.length; i++){
            nums[0] = nums[0]^nums[i];
        }
        return nums[0];
    }
}
