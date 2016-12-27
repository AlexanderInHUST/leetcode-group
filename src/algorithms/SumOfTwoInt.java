package algorithms;

import java.util.ArrayList;

/**
 * Created by tangyifeng on 16/12/27.
 * Email: yifengtang@uniquestudio.com
 */
public class SumOfTwoInt {

    public static void main(String args[]){
        System.out.println(new SumOfTwoInt().getSub(3,23));
    }

    private int getSum(int a, int b) {
       if(b == 0){
           return a;
       }
       int sum = a ^ b;
       int carry = (a & b) << 1;
       return getSum(sum, carry);
    }

    private int getSub(int a, int b){
        if(b == 0){
            return a;
        }
        int sub = a ^ b;
        int carry = ((~ a) & b) << 1;
        return getSub(sub, carry);
    }
}
