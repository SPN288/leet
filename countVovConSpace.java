
import java.util.HashMap;

/*
Problem Statement: Given a string, write a program to count the number of vowels, consonants, and spaces in that string.

Examples:

Example 1:
Input: string str=”Take u forward is Awesome”
Output: 
Vowels: 10
Consonants: 11
White spaces: 4
 */
public class countVovConSpace {

    static void count(String s) {
        int v = 0, c = 0, sp = 0;
        HashMap<Character, Integer> hm = new HashMap();
        hm.put('a', 1);
        hm.put('e', 2);
        hm.put('i', 3);
        hm.put('o', 4);
        hm.put('u', 5);

        for (int i = 0; i < s.length(); i++) {
            char m = s.charAt(i);
            if ((m >= 'A' && m <= 'Z') || (m >= 'a' && m <= 'z')) {
                if (hm.containsKey(m)) {
                    v++;
                } else {
                    c++;
                }
            } else if (m == ' ') {
                sp++;
            }
        }
        System.out.println("Vovels=" + v + "Consonents=" + c + "Space=" + sp);

    }

    public static void main(String[] args) {
        count("Satya Prakash Ghost");
    }
}
