package algorithms;

import java.util.HashMap;

/**
 * Created by tangyifeng on 17/1/26.
 * Email: yifengtang_hust@outlook.com
 */
public class LongestPalindrome_409 {

    public static void main(String[] args) {
        System.out.println(new LongestPalindrome_409().longestPalindrome("abccccdd"));
    }

    public int longestPalindrome(String s) {
        HashMap<Character, Integer> chars = new HashMap<>();
        int length = 0;
        boolean hasOdd = false;
        for(Character c : s.toCharArray()) {
            if(chars.containsKey(c)) {
                chars.put(c, chars.get(c) + 1);
            } else {
                chars.put(c, 1);
            }
        }
        for(Character c : chars.keySet()) {
            int numOfC;
            if(chars.get(c) % 2 == 1) {
                numOfC = chars.get(c) - 1;
                hasOdd = true;
            } else {
                numOfC = chars.get(c);
            }
            length = length + numOfC;
        }
        if(hasOdd)
            length = length + 1;
        return length;
    }
}
