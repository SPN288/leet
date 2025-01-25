
import java.util.HashMap;

public class Q2661Painted {
    public static void main(String[] args) {
       int[] arr = {2,8,7,4,1,3,5,6,9};
        int[][] mat = {{3,2,5},{1,4,6},{8,7,9}};
        HashMap<Integer,Integer[]>hm=new HashMap<>();
        hm.put(1, new Integer[]{0,0});
        hm.put(2, new Integer[]{0,1});
        System.out.println(hm.get(2)[1]);

    }
}
