public class Q14longestprefix {

    public static String longestCommonPrefix(String[] strs) {
        int lo=Integer.MAX_VALUE;
        String ans="";
        int l=strs.length;
        
         if(l==1){return strs[0];}

        for (int i = 0; i < l-1; i++) {
            int count=0;String s1=strs[i],s2=strs[i+1];
            for (int idx = 0; idx < Math.min(s1.length(), s2.length()); idx++) {
                if(s1.charAt(idx)==s2.charAt(idx)){
                    count++;
                }else break;
                
            }lo=Math.min(count, lo);

        }
        for(int j=0;j<lo;j++){
            ans=ans+(strs[0].charAt(j));
        }

         return ans;
    }
    public static void main(String[] args) {
        String[] strs = {"a"};
        
       System.out.println("Answer is - "+longestCommonPrefix(strs));
    //    String c="";
    //    System.out.println(c);
    //    c=c+'s';
    //    System.out.println(c);
    }
    
}
