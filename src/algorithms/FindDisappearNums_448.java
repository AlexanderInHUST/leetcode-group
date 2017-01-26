package algorithms;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Lily on 2016/12/25.
 * Email: yifengtang@hustunique.com
 */
public class FindDisappearNums_448 {

    public static void main(String args[]){
        System.out.println(new FindDisappearNums_448().findDisappearedNumbers(new int[]{10,2,5,10,9,1,1,4,3,7}));
    }

    private List<Integer> findDisappearedNumbers(int[] nums) {
        LinkedList<Integer> answer = new LinkedList<>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != i + 1){
                if(nums[nums[i] - 1] != nums[i]){
                    int temp = nums[i];
                    nums[i] = nums[temp - 1];
                    nums[temp - 1] = temp;
                    i--;
                }
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != i + 1){
                answer.add(i + 1);
            }
        }
        return answer;
    }
}
