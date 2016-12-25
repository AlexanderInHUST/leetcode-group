package algorithms;

/**
 * Created by Lily on 2016/12/25.
 * Email: yifengtang@hustunique.com
 */
public class HammingDistance {

    public static void main(String args[]){
        System.out.println(new HammingDistance().hammingDistance(7, 1));
    }

    private int hammingDistance(int x, int y) {
        int xoy = x ^ y;
        int count = 0;
        while(xoy > 0){
            if(xoy % 2 == 1)
                count++;
            xoy = xoy >> 1;
        }
        return count;
    }
}
