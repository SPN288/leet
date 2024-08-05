public class Q1768MergestringAlternately {
    static String mergeAlternately(String word1, String word2) {
        StringBuilder sb=new StringBuilder();
        int max=word1.length()+word2.length();
        int i=0,w1=0,w2=0;
        while (i<max) { 
            if(w1<word1.length()){
                sb.append(word1.charAt(w1));
                w1++;
            }
            if(w2<word2.length()){
                sb.append(word2.charAt(w2));
                w2++;
            }
            i++;
        }


        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(mergeAlternately("abc", "pqr"));
    }
}
