import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Q1408StringMatching {
    public static List<String> stringMatching(String[] words) {
        List<String> ans=new ArrayList<>();
        HashSet<String>hs=new HashSet<>();

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if(i==j){continue;}
                if(words[i].contains(words[j])){
                    hs.add(words[j]);
                }
            }
        }
        for (String elem : hs) {
            ans.add(elem);
        }
        

        return ans;
    }

    public static void main(String[] args) {
        String[] words = {"mass","as","hero","superhero","leetcode","et","code"};
        System.out.println(stringMatching(words));
    }
}
