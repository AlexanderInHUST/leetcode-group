package algorithms;

/**
 * Created by tangyifeng on 17/1/12.
 * Email: yifengtang@uniquestudio.com
 */
public class MajorityElement_169 {

    public static void main(String args[]){
        System.out.println(new MajorityElement_169().majorityElement(new int[]{}));
    }

    public int majorityElement(int[] nums) {
        int key = nums[0], count = 0;
        for(int num : nums){
            if(key == num){
                count++;
            }else{
                count--;
            }
            if(count == 0){
                key = num;
                count = 1;
            }
        }
        return key;
    }
}
