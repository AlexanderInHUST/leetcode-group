package algorithms;

/**
 * Created by tangyifeng on 17/1/9.
 * Email: yifengtang@uniquestudio.com
 */
public class FirstUniqueChar {

    public static void main(String args[]){
        System.out.println(new FirstUniqueChar().firstUniqChar("loveleetcode"));
    }

    public int firstUniqChar(String s) {
        int alphabets[] = new int[26];
        char sChar[] = s.toCharArray();
        for(int i = 0; i < 26; i++)
            alphabets[i] = Integer.MAX_VALUE;
        for(int i = 0; i < sChar.length; i++){
            if(alphabets[sChar[i] - 'a'] == Integer.MAX_VALUE)
                alphabets[sChar[i] - 'a'] = i;
            else
                alphabets[sChar[i] - 'a'] = Integer.MAX_VALUE - 1;
        }
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < 26; i++){
            if(min > alphabets[i])
                min = alphabets[i];
        }
        return (min == Integer.MAX_VALUE || min == Integer.MAX_VALUE - 1) ? -1 : min;
    }

}
