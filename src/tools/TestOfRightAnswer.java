package tools;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by tangyifeng on 17/1/27.
 * Email: yifengtang_hust@outlook.com
 */
public class TestOfRightAnswer {

    public static void main(String[] args) {
        System.out.println(new TestOfRightAnswer().numberOfBoomerangs(new int[][]{{5,5},{4,7},{6,5},{6,9},{3,7},{4,5},{2,5},{4,4},{3,0}}));
    }

    public int numberOfBoomerangs(int[][] points) {
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<points.length; i++) {
            for(int j=0; j<points.length; j++) {
                if(i == j)
                    continue;
                int d = getDistance(points[i], points[j]);
                map.put(d, map.getOrDefault(d, 0) + 1);
            }
            for(int val : map.values()) {
                res += val * (val-1);
            }
            map.clear();
        }
        return res;
    }

    private int getDistance(int[] a, int[] b) {
        int dx = a[0] - b[0];
        int dy = a[1] - b[1];

        return dx*dx + dy*dy;
    }
}
