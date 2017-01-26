package algorithms;

/**
 * Created by tangyifeng on 16/12/27.
 * Email: yifengtang@uniquestudio.com
 */
public class FindDifference_389 {

    public static void main(String arg[]){
        System.out.println(new FindDifference_389().findTheDifference("abcd","abcdr"));
    }

    public char findTheDifference(String s, String t) {
        int sumS = 0;
        int sumT = 0;
        for(int i = 0; i < s.length(); i++){
            sumS = s.charAt(i) + sumS;
            sumT = t.charAt(i) + sumT;
        }
        sumT = sumT + t.charAt(t.length() - 1);
        return (char)(sumT - sumS);
    }

}
