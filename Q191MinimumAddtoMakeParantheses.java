public class Q191MinimumAddtoMakeParantheses {
    public static int minAddToMakeValid(String s) {
        int o=0,c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                o++;
            }else{
                if(o!=0){
                    o--;
                }else{c++;}
            }
        }
        return(o+c);
    }
    public static void main(String[] args) {
        System.out.println(minAddToMakeValid("()))((()"));
    }
}
