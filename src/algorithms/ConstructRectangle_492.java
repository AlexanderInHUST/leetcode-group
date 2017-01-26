package algorithms;

/**
 * Created by tangyifeng on 17/1/26.
 * Email: yifengtang_hust@outlook.com
 */
public class ConstructRectangle_492 {

    public int[] constructRectangle(int area) {
        int width = (int) Math.sqrt(area);
        while(area % width != 0) {
            width--;
        }
        return new int[]{area / width, width};
    }
}
