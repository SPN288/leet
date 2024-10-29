import java.util.ArrayList;
import java.util.List;

public class Q118Pascaltriangle {

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        ans.add(List.of(1));
        if(numRows==1){return ans;}
        ans.add(List.of(1,1));
        if(numRows==2){return ans;}

        for(int i=2;i<numRows;i++){
            List<Integer> l1=new ArrayList<>();
            l1.add(1);
            for (int j = 1; j < ans.get(i-1).size(); j++) {
                l1.add(ans.get(i-1).get(j-1)+ans.get(i-1).get(j));
            }
            l1.add(1);
            ans.add(l1);
        }

        return ans;
    }
    public static void main(String[] args) {
        System.out.println(generate(4)); 
    }
}
