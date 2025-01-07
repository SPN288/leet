
import java.util.ArrayList;
import java.util.Stack;

public class Q901OnlineStockSpam {
    static class StockSpanner {
        ArrayList<Integer> al=new ArrayList<>();
        Stack<Integer>st=new Stack<>();

        public StockSpanner() {
            
        }
        
        public int next(int price) {
            al.add(price);
            if (st.isEmpty()) {
                st.push(al.size() - 1);
                return 1;
            }
            int ans;
    
            while (al.get(st.peek()) <= al.get(al.size() - 1)) {
                st.pop();
                if (st.isEmpty()) {
                    st.push(al.size() - 1);
                    return al.size();
                }
            }
            ans = al.size() - st.peek() - 1;
            // if(al.get(st.peek()) == al.get(al.size() - 1)){ans++;}
            // st.push(al.size() - 1);
            return ans;
        }
    }

    public static void main(String[] args) {
        StockSpanner ss=new StockSpanner();//[null, 1, 1, 1, 2, 1, 4, 6]
        System.out.println(ss.next(100));
        //System.out.println(ss.next(100));
        System.out.println(ss.next(80));
        System.out.println(ss.next(60));
        System.out.println(ss.next(70));
        System.out.println(ss.next(60));
        System.out.println(ss.next(75));
        System.out.println(ss.next(85));
    }
}
