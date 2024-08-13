
public class Q151ReversewordsInString {

    public static String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        StringBuilder temp = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                temp.append(s.charAt(i));
            }
            if (s.charAt(i) == ' ' && temp.length() != 0) {
                ans.append(temp.reverse() + " ");
                temp.delete(0, temp.length());
            }

            if (i == 0) {
                ans.append(temp.reverse());
            }
            
        }
        
        if(ans.charAt(ans.length()-1)==' '){
            ans.deleteCharAt(ans.length()-1);
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        System.out.println("START->"+reverseWords("the sky is blue")+"<-END");

        System.out.println("START->"+reverseWords("  hello world  ")+"<-END");

        System.out.println("START->"+reverseWords("a good   example")+"<-END");
    }
}
