public class Q2696MinimumStringLengthAfterRemovingSubstring {

    public static String remover(String s){
        StringBuilder sb=new StringBuilder();
        int c=0;
        for (int i = 0; i < s.length(); ) {
            if(i==s.length()-1){sb.append(s.charAt(i)); break;}
            if((s.charAt(i)=='A'&&s.charAt(i+1)=='B')||(s.charAt(i)=='C'&&s.charAt(i+1)=='D')){
                i+=2;c=1;
            }else{sb.append(s.charAt(i));i++;}
        }
        if(c==0){return s;}

        return remover(sb.toString());
    }

    public static int minLength(String s) {
        return remover(s).length();
    }

    public static void main(String[] args) {
        System.out.println(minLength("ABFCACDB"));//2
        System.out.println(minLength("ACBBD"));
    }
}
