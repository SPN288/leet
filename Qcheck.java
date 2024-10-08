import java.util.*;
public class Qcheck {
    public static List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                ans.add("FizzBuzz");
                continue;
            }
            if (i % 3 == 0) {
                ans.add("Fizz");
                continue;
            }
            if (i % 5 == 0) {
                ans.add("Buzz");
                continue;
            }
            ans.add(String.valueOf(i));
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(fizzBuzz(15));
    }

}
