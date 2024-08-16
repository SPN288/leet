
import java.util.ArrayList;
import java.util.List;
/*You are given m arrays, where each array is sorted in ascending order.

You can pick up two integers from two different arrays (each array picks one) and calculate the distance. 
We define the distance between two integers a and b to be their absolute difference |a - b|.

Return the maximum distance. */

public class Q624MaximumDistanceinArray {

    // public static int maxDistance(List<List<Integer>> arrays) {

    //     int[] mx = new int[arrays.size()];
    //     int[] mi = new int[arrays.size()];

    //     for (int i = 0; i < arrays.size(); i++) {
    //         int max = Integer.MIN_VALUE;
    //         int min = Integer.MAX_VALUE;
    //         for (int j = 0; j < arrays.get(i).size(); j++) {
    //             if (arrays.get(i).get(j) > max) {
    //                 max = arrays.get(i).get(j);
    //             }
    //             if (arrays.get(i).get(j) < min) {
    //                 min = arrays.get(i).get(j);
    //             }
    //         }
    //         mx[i] = max;
    //         mi[i] = min;
    //     }
    //     if(mi.length==1&&mx.length==1){
    //         return Math.abs(mx[0]-mi[0]);
    //     }
    //     int ans = Integer.MIN_VALUE;
    //     for (int i = 0; i < mx.length; i++) {
    //         for (int j = 0; j < mi.length; j++) {
    //             if (i == j) {
    //                 continue;
    //             }
    //             if (Math.abs(mx[i] - mi[j]) > ans) {
    //                 ans = Math.abs(mx[i] - mi[j]);
    //             }
    //         }
    //     }
    //     return ans;

    // }
    public static int maxDistance(List<List<Integer>> arrays) {
        int ans = 0;
    int mn = 10000;
    int mx = -10000;

    for (List<Integer> A : arrays) {
      ans = Math.max(ans, Math.max(A.get(A.size() - 1) - mn, mx - A.get(0)));
      mn = Math.min(mn, A.get(0));
      mx = Math.max(mx, A.get(A.size() - 1));
    }

    return ans;
    }

    public static void main(String[] args) {
        List<List<Integer>> ll = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        List<Integer> l3 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l2.add(4);
        l2.add(5);
        l3.add(1);
        l3.add(2);
        l3.add(3);
        ll.add(l1);
        ll.add(l2);
        ll.add(l3);
        System.out.println(maxDistance(ll));
        List<List<Integer>> ll2 = new ArrayList<>();
        List<Integer> l4 = new ArrayList<>();
        List<Integer> l5 = new ArrayList<>();
        l4.add(1);
        l5.add(1);
        ll2.add(l4);
        ll2.add(l5);
        System.out.println(maxDistance(ll2));
    }

}
