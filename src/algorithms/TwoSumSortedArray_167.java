package algorithms;

import java.util.Arrays;

/**
 * Created by tangyifeng on 17/1/26.
 * Email: yifengtang_hust@outlook.com
 */
public class TwoSumSortedArray_167 {

    public static void main(String args[]) {
        int result[] = new TwoSumSortedArray_167().twoSum(new int[]{2, 7, 11, 14}, 9);
        System.out.println(result[0] + " " + result[1]);
    }

    public int[] twoSum(int[] numbers, int target) {
        for(int i = 0; i < numbers.length; i++) {
            int result = Arrays.binarySearch(numbers, i + 1, numbers.length, target - numbers[i]);
            if(result > 0) {
                return new int[]{i + 1, result + 1};
            }
        }
        return null;
    }
}
