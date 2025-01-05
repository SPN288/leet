
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q1930Unique3PalindromicSubsequence {

    public static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;      
            }
            i++;
            j--;
        }
        return true;      
    }

    public static List<String> findSubsequences(String s) {
        int n = s.length();
        List<String> subsequences = new ArrayList<>();

        
        int totalSubsequences = 1 << n;
        for (int mask = 0; mask < totalSubsequences; mask++) {
            StringBuilder subsequence = new StringBuilder();

            
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    subsequence.append(s.charAt(i));
                }
            }
            if(subsequence.length()==3){
                subsequences.add(subsequence.toString());
            }
        }
        

        return subsequences;
    }
    
    public static int countPalindromicSubsequence(String s) {
        
        
        List<String> al = findSubsequences(s);
        System.out.println(al);

        HashMap<String,Integer> hm=new HashMap<>();

        for (int i = 0; i < al.size(); i++) {
            if(isPalindrome(al.get(i))&&!hm.containsKey(al.get(i))){
                hm.put(al.get(i), i);
            }
        }




        return hm.size();
    }

    public static void main(String[] args) {
        String s = "tlpjzdmtwderpkpmgoyrcxttiheassztncqvnfjeyxxp";
        String p="adc";
        String n="bbcbaba";
        
        System.out.println(countPalindromicSubsequence(s));//3
         //System.out.println(countPalindromicSubsequence(p));//0
        // System.out.println(countPalindromicSubsequence(n));//4
    }
}
