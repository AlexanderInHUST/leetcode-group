package algorithms;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by tangyifeng on 17/1/12.
 * Email: yifengtang@uniquestudio.com
 */
public class NumberComplement {

    public static void main(String args[]) {
        System.out.println(new NumberComplement().findComplement(1));
    }

    public int findComplement(int num) {
        int nums[] = new int[32];
        int count = 0, result = 0;
        while (num != 0) {
            nums[count++] = (num % 2 == 1) ? 0 : 1;
            num = num / 2;
        }
        for(int i = 0; i < count; i++) {
            result = result + nums[i] * (int)Math.pow(2, i);
        }
        return result;
    }
}
