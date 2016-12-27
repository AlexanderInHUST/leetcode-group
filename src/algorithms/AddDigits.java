package algorithms;

/**
 * Created by tangyifeng on 16/12/27.
 * Email: yifengtang@uniquestudio.com
 */
public class AddDigits {

    public static void main(String args[]){
        System.out.println(new AddDigits().addDigits(123));
    }

    private int addDigits(int num) {
        if(num == 0)
            return 0;
        int answer = num % 9;
        return (answer == 0) ? 9 : answer;
    }

}
