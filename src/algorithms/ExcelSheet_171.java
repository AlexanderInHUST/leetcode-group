package algorithms;

/**
 * Created by tangyifeng on 17/1/9.
 * Email: yifengtang@uniquestudio.com
 */
public class ExcelSheet_171 {

    public static void main(String args[]){
        System.out.println(new ExcelSheet_171().titleToNumber("AB"));
    }

    public int titleToNumber(String s) {
        int result = 0, count = 0;
        while(!s.equals("")){
            result = (int)Math.pow(26, count++) * (s.charAt(s.length() - 1) - 'A' + 1) + result;
            s = s.substring(0, s.length() - 1);
        }
        return result;
    }

}
