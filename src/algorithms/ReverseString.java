package algorithms;

/**
 * Created by Lily on 2016/12/25.
 * Email: yifengtang@hustunique.com
 */
public class ReverseString {

    public static void main(String args[]){
        System.out.println(new ReverseString().reverseString("1234567890"));
    }

    private String reverseString(String s) {
        if(s.length() == 1)
            return s;
        String leftString = s.substring(0, s.length()/2);
        String rightString = s.substring(s.length()/2 , s.length());
        return reverseString(rightString) + reverseString(leftString);
    }
}
