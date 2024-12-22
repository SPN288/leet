
import java.util.Stack;

public class Q2390RemovingStars {

    public static String removeStars(String s) {
        StringBuilder ans=new StringBuilder();
        Stack<Character> st=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)!='*'){
                st.push(s.charAt(i));
            }else{
                st.pop();
            }
        }
        int x=st.size();
        for (int i = 0; i < x; i++) {
            ans.append(st.pop());
        }
        ans.reverse();
    
        return ans.toString();
    }
    
    public static void main(String[] args) {
        System.out.println(removeStars("leet**cod*e"));
    }
}
