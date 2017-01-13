package algorithms;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by tangyifeng on 17/1/12.
 * Email: yifengtang@uniquestudio.com
 */
public class ValidAnagram {

    public static void main(String args[]){
        System.out.println(new ValidAnagram().isAnagram("a","a"));
    }

    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character, Integer> alphabetsMap = new HashMap<>();
        for(Character c : s.toCharArray()){
            alphabetsMap.put(c, (alphabetsMap.containsKey(c) ? alphabetsMap.get(c) + 1 : 1));
        }
        for(Character c : t.toCharArray()){
            if(alphabetsMap.containsKey(c) && alphabetsMap.get(c) > 0)
                alphabetsMap.put(c, alphabetsMap.get(c) - 1);
            else
                return false;
        }
        return true;
    }
}
