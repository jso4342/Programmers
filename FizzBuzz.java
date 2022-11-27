import java.util.*;

class Solution {
    public static boolean divisibleThree(int n){
        if (n % 3 == 0){
            return true;
        }
        return false;
    }

    public static boolean divisibleFive(int n){
        if (n % 5 == 0){
            return true;
        }
        return false;
    }

    public List<String> fizzBuzz(int n) {
        ArrayList<String> answer = new ArrayList<String>();
        for (int i = 1; i < n + 1; i++){
            if (divisibleThree(i) == true && divisibleFive(i) == true){
                answer.add("FizzBuzz");
            } else if (divisibleThree(i) == true){
                answer.add("Fizz");
            } else if (divisibleFive(i) == true){
                answer.add("Buzz");
            } else {
                answer.add(Integer.toString(i));
            }
        }
        return answer;
    }
}
