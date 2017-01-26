package algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tangyifeng on 17/1/26.
 * Email: yifengtang_hust@outlook.com
 */
public class BinaryWatch_401 {

    public static void main(String[] args) {
        System.out.println(new BinaryWatch_401().readBinaryWatch(2));
    }

    public List<String> readBinaryWatch(int num) {
        List<String> result = new ArrayList<>();
        setTime(result, new int[10], num, 0);
        return result;
    }

    private void setTime(List<String> result, int bits[], int num, int pos) {
        if(num == 0) {
            String time = getTime(bits);
            if(time != null)
                result.add(time);
        } else {
            for(int i = pos; i < bits.length; i++) {
                if(bits[i] != 1) {
                    bits[i] = 1;
                    setTime(result, bits, num - 1, i + 1);
                    bits[i] = 0;
                }
            }
        }
    }

    private String getTime(int bits[]) {
        int hour = 0, minute = 0;
        for(int i = 0; i < 4; i++) {
            hour = bits[i] * (int) Math.pow(2, i) + hour;
        }
        for(int i = 4; i < 10; i++) {
            minute = bits[i] * (int) Math.pow(2, i - 4) + minute;
        }
        if(hour >= 12 || minute >= 60)
            return null;
        return "" + hour + ":" + ((minute < 10) ? "0" + minute : minute);
    }
}
