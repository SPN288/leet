public class Q2185CountingWords {
    static public int prefixCount(String[] words, String pref) {
        int count=0;
        for(int i=0;i<words.length;i++){
            if(pref.length()>words[i].length()){continue;}
            if(pref.equals(words[i].substring(0,pref.length()))){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String[] words = {"pay","attention","practice","attend"};
        String pref = "at";
        System.out.println(prefixCount(words, pref));
    }
}
