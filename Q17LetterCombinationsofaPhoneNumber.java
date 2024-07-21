public class Q17LetterCombinationsofaPhoneNumber {
    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty())
          return new ArrayList<>();
    
        List<String> ans = new ArrayList<>();
    
        dfs(digits, 0, new StringBuilder(), ans);
        return ans;
      }
    
      private static final String[] digitToLetters = {"",    "",    "abc",  "def", "ghi",
                                                      "jkl", "mno", "pqrs", "tuv", "wxyz"};
    
      private void dfs(String digits, int i, StringBuilder sb, List<String> ans) {
        if (i == digits.length()) {
          ans.add(sb.toString());
          return;
        }
    
        for (final char c : digitToLetters[digits.charAt(i) - '0'].toCharArray()) {
          sb.append(c);
          dfs(digits, i + 1, sb, ans);
          sb.deleteCharAt(sb.length() - 1);
        }
      }
    }
    
    Approach 2: Iterative¶
    Time: 
    𝑂
    (
    𝑛
    4
    𝑛
    )
    O(n4 
    n
     )
    Space: 
    𝑂
    (
    4
    𝑛
    )
    O(4 
    n
     )
    
    C++
    Java
    Python
    
    class Solution {
     public:
      vector<string> letterCombinations(string digits) {
        if (digits.empty())
          return {};
    
        vector<string> ans{""};
        const vector<string> digitToLetters{"",    "",    "abc",  "def", "ghi",
                                            "jkl", "mno", "pqrs", "tuv", "wxyz"};
    
        for (const char d : digits) {
          vector<string> temp;
          for (const string& s : ans)
            for (const char c : digitToLetters[d - '0'])
              temp.push_back(s + c);
          ans = move(temp);
        }
    
        return ans;
      }
}
