
import java.util.*;

public class Q354ReverseVowels {

    public static String reverseVowels(String s) {
        StringBuilder ans = new StringBuilder();
        StringBuilder vov = new StringBuilder();

        HashMap <Character,Character> l = new HashMap<>();
        // List<Character> l = new ArrayList<>();
        l.put('a','a');
        l.put('e','e');
        l.put('i','i');
        l.put('o','o');
        l.put('u','u');
        l.put('A','A');
        l.put('E','E');
        l.put('I','I');
        l.put('O','O');
        l.put('U','U');

        for (int i = 0; i < s.length(); i++) {
            if (l.containsKey(s.charAt(i))) {
                vov.append(s.charAt(i));
            }
        }
        int j = vov.length()-1;
        for (int i = 0; i < s.length(); i++) {
            if (l.containsKey(s.charAt(i))) {
                ans.append(vov.charAt(j));
                j--;
            } else {
                ans.append(s.charAt(i));
            }
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));
        System.out.println(reverseVowels("leetcode"));
    }
}
