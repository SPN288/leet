public class Q3042CountPrefixandSuffix {

    static  boolean isPrefixAndSuffix(String s1,String s2){
        if(s2.length()<s1.length()){
            return false;
        }
        if(s1.equals(s2)){
            return true;
        }
        // System.out.println(s2.substring(s2.length()-s1.length(), s2.length()));
        if (s1.equals(s2.substring(0, s1.length())) && s1.equals(s2.substring(s2.length()-s1.length(), s2.length()))  ) {
            return true;
        }
        return false;
    }
    static public int countPrefixSuffixPairs(String[] words) {
        int count=0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i+1; j < words.length; j++) {
                if (isPrefixAndSuffix(words[i], words[j])) {
                    count++;
                }
            }
        }
        return count;
        
    }
    public static void main(String[] args) {
        String [] words = {"a","aba","ababa","aa"};
        System.out.println(countPrefixSuffixPairs(words));
    }
}
