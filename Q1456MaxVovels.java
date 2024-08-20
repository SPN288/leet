import java.util.*;

public class Q1456MaxVovels {
    public static int maxVowels(String s, int k) {
        HashMap<Character,Character>hm=new HashMap<>();
        hm.put('a', 'a');hm.put('e', 'e');hm.put('i', 'i');hm.put('o', 'o');hm.put('u', 'u');
        int count=0;
        int i;
        for ( i = 0; i < k; i++) {
            if(hm.containsKey(s.charAt(i))){
                count++;
            }
        }
        int max=count;
        for ( i = k; i < s.length(); i++) {
            if(hm.containsKey(s.charAt(i-k))){
                count--;
            }
            if(hm.containsKey(s.charAt(i))){
                count++;
            }
            if(count>=max){
                max=count;
            }
        }

        return max;
    }
    // public static int maxVowels(String s, int k) {

    //     int count = 0;
    //     int i;
    //     for (i = 0; i < k; i++) {
    //         if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
    //             count++;
    //         }
    //     }
    //     int max = count;
    //     for (i = k; i < s.length(); i++) {
    //         if (s.charAt(i - k) == 'a' || s.charAt(i - k) == 'e' || s.charAt(i - k) == 'i' || s.charAt(i - k) == 'o' || s.charAt(i - k) == 'u') {
    //             count--;
    //         }
    //         if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
    //             count++;
    //         }
    //         if (count >= max) {
    //             max = count;
    //         }
    //     }

    //     return max;
    // }

    public static void main(String[] args) {
        System.out.println(maxVowels("abciiidef", 3));
    }
}
