public class Q3LongestSubstring {


    public static int lengthOfLongestSubstring(String s) {
        //HashMap<Character,Character> map=new HashMap<>();
        int count=0;int longest=0;
        for (int i = 0; i < s.length()-1; i++) {
            if(s.charAt(i)==s.charAt(i+1)){
                longest=Math.max(longest, count);
            }else count++;
        }
     return longest;   
    }
    public static void main(String[] args) {
        String ss="abcabcbb";
        int d=lengthOfLongestSubstring(ss);
        System.out.println(d);
    }
}
