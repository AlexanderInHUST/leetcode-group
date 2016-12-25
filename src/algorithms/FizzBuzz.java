package algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lily on 2016/12/25.
 * Email: yifengtang@hustunique.com
 */
public class FizzBuzz {

    public static void main(String args[]){
        System.out.println(new FizzBuzz().fizzBuzz(15));
    }

    private List<String> fizzBuzz(int n) {
        ArrayList<String> answer = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            StringBuilder builder = new StringBuilder();
            if(i % 3 != 0 && i % 5 != 0){
                builder.append(i);
            }else{
                if(i % 3 == 0) {
                    builder.append("Fizz");
                }
                if(i % 5 == 0){
                    builder.append("Buzz");
                }
            }
            answer.add(builder.toString());
        }
        return answer;
    }
}
