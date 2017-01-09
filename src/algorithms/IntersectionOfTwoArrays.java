package algorithms;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by tangyifeng on 17/1/9.
 * Email: yifengtang@uniquestudio.com
 */
public class IntersectionOfTwoArrays {

    public static void main(String args[]){
        int result[] = new IntersectionOfTwoArrays().intersection(new int[]{1, 2, 2, 1, 3}, new int[]{1, 2});
        for (Integer i : result){
            System.out.println(i);
        }
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> num = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();
        for(Integer n : nums1){
            num.add(n);
        }
        for(Integer n : nums2){
            if(num.contains(n))
                intersection.add(n);
        }
        int result[] = new int[intersection.size()];
        for(int i = 0; i < intersection.size(); i++)
            result[i] = (Integer) intersection.toArray()[i];
        return result;
    }
}
