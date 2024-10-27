import java.util.*;
public class Q30SubstringWithMaxConcat {
    public static List<Integer> findSubstring(String s, String[] words) {
        List<Integer> ans=new ArrayList<>();
        List<String> st=new ArrayList<>();
        HashMap<String,Integer> hm=new HashMap<>();
        
        for (int i = 0; i < words.length; i++) {
            if(hm.containsKey(words[i])){
                hm.put(words[i],hm.get(words[i])+1 );
            }else{
                hm.put(words[i],1 );
            }
        }
        //System.out.println(" map= "+hm);
        int cs=words[0].length();
        for (int i = 0; i < s.length(); i += cs) {
            st.add(s.substring(i, i+cs));
        }
        
        for (int i = 0; i < st.size()-words.length+1; i++) {
            HashMap<String,Integer>checkmap=new HashMap<>();
            for (int j = i; j < words.length +i; j++) {
                if(checkmap.containsKey(st.get(j))){
                    checkmap.put(st.get(j),checkmap.get(st.get(j))+1 );
                }else{
                    checkmap.put(st.get(j),1 );
                }
            }
            System.out.println(checkmap);
            
            if(hm.equals(checkmap)){ans.add(i*cs);}

        }

        return ans;
    }

    public static void main(String[] args) {
        String s = "lingmindraboofooowingdingbarrwingmonkeypoundcake";
        String[] words = {"fooo","barr","wing","ding","wing"};
        System.out.println(findSubstring(s, words));
    }
}
