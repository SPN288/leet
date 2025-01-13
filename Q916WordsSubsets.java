import java.util.ArrayList;
import java.util.List;

public class Q916WordsSubsets {

    public static List<String> wordSubsets(String[] A, String[] B) {
        List<String> ans = new ArrayList<>();
        int[] countB = new int[26];
    
        for (final String b : B) {
          int[] temp = counter(b);
          for (int i = 0; i < 26; ++i)
            countB[i] = Math.max(countB[i], temp[i]);
        }
    
        for (final String a : A)
          if (isUniversal(counter(a), countB))
            ans.add(a);
    
        return ans;
      }
    
      private static  int[] counter(final String s) {
        int[] count = new int[26];
        for (char c : s.toCharArray())
          ++count[c - 'a'];
        return count;
      }
    
      private static  boolean isUniversal(int[] countA, int[] countB) {
        for (int i = 0; i < 26; ++i)
          if (countA[i] < countB[i])
            return false;
        return true;
      }

    public static void main(String[] args) {
        String[] words1 = {"amazon", "apple", "facebook", "google", "leetcode"};
        String[] words2 = {"e", "o"};
        System.out.println(wordSubsets(words1, words2));

    }
}
