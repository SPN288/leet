public class Q680palindromee {

    static boolean palindrome(String s){
        
        for (int i = 0; i < s.length()/2; i++) {
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    // public static boolean validPalindrome(String s) {
    //     if(s.length()==0){return false;}
    //     if(s.length()==1){return true;}
    //     String check="";
    //     int l=s.length();
    //     if(palindrome(s)){
    //         return true;
    //     }
    //     int j=l-1;
    //     for (int i = 0; i < l; i++) {
    //         if(s.charAt(i)==s.charAt(j)){
    //             check=check+s.charAt(i);
    //             j--;
    //         }else if (s.charAt(i)==s.charAt(j-1)) {
    //             check=check+s.charAt(i);
    //             j--;
    //         }else if (i+1<=l-1&&s.charAt(i+1)==s.charAt(j)) {
    //             i++;
    //             check=check+s.charAt(i);
    //             j--;
    //         }
    //     }
    //     if(check.length()==0||check.length()==1){return false;}
    //     return palindrome(check);
    // }
    public static boolean validPalindrome(String s) {
        if(s.length()==0){return false;}
        if(s.length()==1){return true;}
        int l=s.length();
        if(palindrome(s)){
            return true;
        }
        for (int i = 0; i < l; i++) {
            String c="";
            for(int j=0;j<l;j++){
                if(j==i){}else{c+=s.charAt(j);}
            }
            if(palindrome(c)){return true;}
        }
        return false;
    }
    public static void main(String[] args) {
        String s1="cbbcc";
        String s2="abca";
        String s3="abc";
       System.out.println(validPalindrome(s1));
         System.out.println(validPalindrome(s2));
        System.out.println(validPalindrome(s3));
    }
    
}
