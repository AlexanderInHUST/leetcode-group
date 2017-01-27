package algorithms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Created by tangyifeng on 17/1/27.
 * Email: yifengtang_hust@outlook.com
 */
public class NumberOfBoomerangs_447 {

    public static void main(String[] args) {
        System.out.println(new NumberOfBoomerangs_447().
                numberOfBoomerangs(new int[][]{{3,7},{2,5},{4,4}}));
    }

    public int numberOfBoomerangs(int[][] points) {
        int result = 0;
        HashMap<Line, Integer> lines = new HashMap<>();
        for(int i = 0; i < points.length - 1; i++) {
            for(int j = i + 1; j < points.length; j++) {
                Line line = new Line();
                double x1 = (double)points[i][0];
                double x2 = (double)points[j][0];
                double y1 = (double)points[i][1];
                double y2 = (double)points[j][1];
                if(y1 == y2) {
                    line.k = Double.MAX_VALUE;
                    line.b = (x1 + x2) / 2;
                } else {
                    line.k = - (x1 - x2) / (y1 - y2);
                    line.b = (y1 + y2) / 2 + (x1 - x2) / (y1 - y2) * (x1 + x2) / 2;
                }
                lines.put(line, lines.getOrDefault(line, 0) + 1);
            }
        }
        for(int i = 0; i < points.length; i++) {
            double x = points[i][0];
            double y = points[i][1];
            for(Line line : lines.keySet()) {
                if(line.fit(x, y)) {
                    result = result + lines.get(line) * 2;
                }
            }
        }
        return result;
    }

    class Line {

        double k;
        double b;

        @Override
        public boolean equals(Object o) {
            Line other = (Line) o;
            return Math.abs(other.k - k) < 0.01 && Math.abs(other.b - b) < 0.01;
        }

        @Override
        public int hashCode() {
            return 1;
        }

        public boolean fit(double x, double y) {
            if (k == Double.MAX_VALUE) {
                return Math.abs(x - b) < 0.01;
            } else {
                return Math.abs(k * x + b - y) < 0.01;
            }
        }
    }

//Better Answer
//    public int numberOfBoomerangs(int[][] points) {
//        int res = 0;
//        Map<Integer, Integer> map = new HashMap<>();
//        for(int i=0; i<points.length; i++) {
//            for(int j=0; j<points.length; j++) {
//                if(i == j)
//                    continue;
//                int d = getDistance(points[i], points[j]);
//                map.put(d, map.getOrDefault(d, 0) + 1);
//            }
//            for(int val : map.values()) {
//                res += val * (val-1);
//            }
//            map.clear();
//        }
//        return res;
//    }
//
//    private int getDistance(int[] a, int[] b) {
//        int dx = a[0] - b[0];
//        int dy = a[1] - b[1];
//
//        return dx*dx + dy*dy;
//    }
}
