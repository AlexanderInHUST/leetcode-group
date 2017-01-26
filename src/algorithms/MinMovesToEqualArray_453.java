package algorithms;

/**
 * Created by tangyifeng on 17/1/26.
 * Email: yifengtang_hust@outlook.com
 */
public class MinMovesToEqualArray_453 {

    public static void main(String[] args) {
        System.out.println(new MinMovesToEqualArray_453().minMoves(new int[]{1, 2, 3}));
    }

    public int minMoves(int[] nums) {
        int sum = 0, min = Integer.MAX_VALUE;
        for(int i : nums) {
            if(i < min)
                min = i;
            sum = sum + i;
        }
        return sum - nums.length * min;
    }
}
