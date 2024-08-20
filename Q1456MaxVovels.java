
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
    public static void main(String[] args) {
        System.out.println(maxVowels("abciiidef", 3));
    }
}
