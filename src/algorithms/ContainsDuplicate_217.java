package algorithms;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by tangyifeng on 17/1/26.
 * Email: yifengtang_hust@outlook.com
 */
public class ContainsDuplicate_217 {

    public static void main(String[] args) {
        System.out.println(new ContainsDuplicate_217().containsDuplicate(new int[]{1, 2, 3, 3}));
    }

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numsSet = new HashSet<>();
        for(int i : nums) {
            numsSet.add(i);
        }
        return numsSet.size() != nums.length;
    }
}
