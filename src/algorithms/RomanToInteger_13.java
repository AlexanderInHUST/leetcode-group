package algorithms;

import java.util.HashMap;

/**
 * Created by tangyifeng on 17/1/26.
 * Email: yifengtang_hust@outlook.com
 */
public class RomanToInteger_13 {

    public static void main(String[] args) {
        System.out.println(new RomanToInteger_13().romanToInt("MMMDLXXXVI"));
    }

    public int romanToInt(String s) {
        int value = 0;
        HashMap<Character, Integer> cMap = getMap();
        for(int i = 0; i < s.length(); i++) {
            if(i != s.length() - 1 &&
                    (s.charAt(i) == 'I' || s.charAt(i) == 'X' || s.charAt(i) == 'C') &&
                    (cMap.get(s.charAt(i + 1)) >  cMap.get(s.charAt(i)))) {
                value = value - cMap.get(s.charAt(i));
            } else {
                value = value + cMap.get(s.charAt(i));
            }
        }
        return value;
    }

    private HashMap<Character, Integer> getMap() {
        HashMap<Character, Integer> cMap = new HashMap<>();
        cMap.put('I', 1);
        cMap.put('V', 5);
        cMap.put('X', 10);
        cMap.put('L', 50);
        cMap.put('C', 100);
        cMap.put('D', 500);
        cMap.put('M', 1000);
        return cMap;
    }

}
