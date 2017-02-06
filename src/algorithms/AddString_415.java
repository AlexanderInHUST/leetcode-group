package algorithms;

/**
 * Created by tangyifeng on 17/2/6.
 * Email: yifengtang_hust@outlook.com
 */
public class AddString_415 {

    public static void main(String[] args) {
        System.out.println(new AddString_415().addStrings("999999", "11"));
    }

    public String addStrings(String num1, String num2) {
        char[] num1Char = num1.toCharArray();
        char[] num2Char = num2.toCharArray();
        StringBuilder sb = new StringBuilder();
        int i, j;
        boolean carry = false;
        for(i = num1Char.length - 1, j = num2Char.length - 1; i >= 0 && j >= 0; i--, j--) {
            int digit = num1Char[i] + num2Char[j] - 2 * '0' + (carry ? 1 : 0);
            if(digit >= 10) {
                digit = digit - 10;
                carry = true;
            } else {
                carry = false;
            }
            sb.insert(0, digit);
        }
        String subString;
        if(i == -1 && j == -1){
            if(carry) {
                sb.insert(0, '1');
            }
            return sb.toString();
        }else if(i == -1) {
            subString = num2.substring(0, j + 1);
        } else {
            subString = num1.substring(0, i + 1);
        }
        StringBuilder sb1 = new StringBuilder();
        for(i = subString.length() - 1; i >= 0; i--) {
            int digit = subString.charAt(i) + (carry ? 1 : 0) - '0';
            if(digit >= 10) {
                digit = digit - 10;
                carry = true;
            } else {
                carry = false;
            }
            sb1.insert(0, digit);
        }
        if(carry) {
            sb1.insert(0, 1);
        }
        sb.insert(0, sb1);
        return sb.toString();
    }

}
