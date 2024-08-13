public class Q151ReversewordsInString {
    public static String reverseWords(String s) {
        StringBuilder ans=new StringBuilder();
        StringBuilder temp=new StringBuilder();

        
        for (int i = s.length()-1; i >=0; i--) {
            
            if(s.charAt(i)==' '){
                ans.append(temp.reverse()+" ");
                temp.delete(0,ans.length());
                i--;
            }
            temp.append(s.charAt(i));
            if(i==0){ans.append(temp.reverse());}

        }


        return ans.toString();
    }
    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
        
        System.out.println(reverseWords("  hello world  "));
        
        System.out.println(reverseWords("a good   example"));
    }
}
