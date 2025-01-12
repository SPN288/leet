import java.util.HashMap;
import java.util.Map;

public class Q3223MinimumLengthOfString {
    public static int minimumLength(String s) {
        HashMap<Character,Integer>hm=new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            if(!hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i),1);
            }else{
                hm.put(s.charAt(i),1+hm.get(s.charAt(i)));
            }
        }
        int ans=0;
        for(Map.Entry<Character,Integer>e:hm.entrySet()){
            int x=e.getValue();
            if(x<3){
                ans+=x;
                continue;
            }
            if(x%2==0){
                ans+=2;
            }else{ans+=1;}
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(minimumLength("abaacbcbb"));
    }
}
