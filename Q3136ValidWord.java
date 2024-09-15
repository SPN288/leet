import java.util.*;
public class Q3136ValidWord {
    public static  boolean isValid(String word) {
        int l=word.length();
        if(l<3){return false;}
        char[] vovel="AEIOUaeiou".toCharArray();
        HashMap<Character,Integer> vov=new HashMap<>();
        for (int i = 0; i < vovel.length; i++) {
            vov.put(vovel[i], i);
        }

        int[] check=new int[2];
        for (int i = 0; i < l; i++) {
            char x=word.charAt(i);
            if((x>='a'&&x<='z')||(x>='A'&&x<='Z')){
                if(vov.containsKey(x)){
                    check[0]=1;
                }else{check[1]=1;}
                continue;
            }
            
            if(Character.getNumericValue(x)>-1&&Character.getNumericValue(x)<10){
                continue;
            }
            return false;
        }
        for (int i = 0; i < 2; i++) {
            if(check[i]==0){return false;}
        }
        
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isValid("aya"));
    }
}
