
public class Q392IsSubsequence {

    public static boolean isSubsequence(String s, String t) {
        if (s.length() == 0) {
            return true;
        }
        if (t.length() == 0) {
            return false;
        }

        int sc = 0, tc = 0;
        while (tc < t.length()) {

            if (s.charAt(sc) == t.charAt(tc)) {
                sc++;
                tc++;
            } else {
                tc++;
            }
            if (sc == s.length()) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc"));
    }

}
