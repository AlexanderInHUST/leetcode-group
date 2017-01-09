package algorithms;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by tangyifeng on 16/12/29.
 * Email: yifengtang@uniquestudio.com
 */
public class AssignCookies {

    public static void main(String args[]){
        System.out.println(new AssignCookies().findContentChildren(new int[]{10, 9, 8, 7}, new int[]{5, 6, 7, 8}));
    }

    public int findContentChildren(int[] g, int[] s) {
        int count = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        for(int i = 0, j = 0; i < g.length && j < s.length; i++, j++){
            if(g[i] <= s[j]){
                count++;
            }else{
                i--;
            }
        }
        return count;
    }

}
