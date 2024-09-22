import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q30SubStringWithConcatinationOfWords {
    public static List<Integer> findSubstring(String s, String[] words) {
        List<Integer> ans= new ArrayList<>();
        int i,ws=words[0].length();
        HashMap<String,String> wo=new HashMap<>();
        for ( i = 0; i < words.length; i++) {
            wo.put(words[i], words[i]);
        }
        for ( i = 0; i < s.length(); i+=ws) {
            for (int j = 0; j < ws*words.length; j++) {
                
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        String[] q={"bar","foo","the"};
        System.out.println(findSubstring("barfoofoobarthefoobarman", q));
    }
}
