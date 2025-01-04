import java.util.HashMap;

public class Q2559CountVovelString {
    /**
     * @param words
     * @param queries
     * @return
     */
    public static int[] vowelStrings(String[] words, int[][] queries) {
        int l=words.length;
        int [] ans=new int[queries.length];
        int [] help =new int[l+1];
        HashMap <Character,Character> hm=new HashMap<>();
        hm.put('a','a');
        hm.put('e','e');
        hm.put('i','i');
        hm.put('o','o');
        hm.put('u','u');

        int i ;
        help[0]=0;
        for (i=0; i < l; i++) {
            if(hm.containsKey(words[i].charAt(0))&& hm.containsKey(words[i].charAt(words[i].length()-1))){
                help[i+1]=1;
            }else{
                help[i+1]=0;
            }
            help[i+1]=help[i]+help[i+1];
        }

        // for (i=1; i <help.length; i++) {
        //     help[i]=help[i-1]+help[i];
        // }
        for (i = 0; i < queries.length; i++) {
            
            ans[i]=help[1+queries[i][1]]-help[queries[i][0]];
        }


        return ans;

    }
    public static void arrayprinter(int[]arr){
        System.out.print('[');
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
            
        }
        System.out.print(']');
    }
    public static void main(String[] args) {
        String[] words = {"aba","bcb","ece","aa","e"};
        int [][] queries = {{0,2},{1,4},{1,1}};//[2,3,0]
         arrayprinter(vowelStrings(words, queries));
        
    }
}
