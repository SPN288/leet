
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.xml.crypto.dsig.spec.HMACParameterSpec;

public class Q916WordsSubsets {

    public static HashMap<Character, Integer> mapmaker(String w1) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < w1.length(); i++) {
            if (hm.containsKey(w1.charAt(i))) {
                hm.put(w1.charAt(i), hm.get(w1.charAt(i)) + 1);
            } else {
                hm.put(w1.charAt(i), 1);
            }
        }
        return hm;
    }

    public static boolean isSubset(HashMap<Character, Integer> m1, HashMap<Character, Integer> m2) {
        for (HashMap.Entry<Character, Integer> e : m2.entrySet()) {
            int x2 = e.getValue();
            char c = e.getKey();
            if (m1.containsKey(c)) {
                if (m1.get(c) < x2) {
                    return false;
                }
            } else {
                return false;
            }

        }
        return true;
    }

    public static List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> al = new ArrayList<>();
        List<HashMap<Character, Integer>> f1 = new ArrayList<>();
        List<HashMap<Character, Integer>> f2 = new ArrayList<>();
        int i;
        for (i = 0; i < words1.length; i++) {
            f1.add(mapmaker(words1[i]));
        }
        for (i = 0; i < words2.length; i++) {
            f2.add(mapmaker(words2[i]));
        }

        for (i = 0; i < words1.length; i++) {
            boolean c = true;
            for (int j = 0; j < words2.length; j++) {
                if (!isSubset(f1.get(i), f2.get(j))) {
                    c = false;
                }
            }
            if (c) {
                al.add(words1[i]);
            }
        }
        return al;
    }

    public static void main(String[] args) {
        String[] words1 = {"amazon", "apple", "facebook", "google", "leetcode"};
        String[] words2 = {"e", "o"};
        System.out.println(wordSubsets(words1, words2));

    }
}
