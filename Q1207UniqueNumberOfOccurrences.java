
import java.util.*;

public class Q1207UniqueNumberOfOccurrences {

    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        ArrayList<Integer> ll = new ArrayList<>();
        int l = arr.length;
        int index = 0;
        int i = 0;
        for (i = 0; i < l; i++) {
            if (!hm.containsKey(arr[i])) {
                hm.put(arr[i], index);
                ll.add(1);
                index++;
            } else {
                ll.set(hm.get(arr[i]), ll.get(hm.get(arr[i])) + 1);
            }

        }
        if (ll.size() == 1) {
            return true;
        }
        //System.out.println(hm);
        hm.clear();
        //System.out.println(hm);
        for (i = 0; i < ll.size(); i++) {
            if (hm.containsKey(ll.get(i))) {
                return false;
            } else {
                hm.put(ll.get(i), i);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {-5, -6, 2, 6, -5, -7, 5};
        int[] arr2 = {1, 2};
        int[] arr3 = {-3, 0, 1, -3, 1, 1, 1, -3, 10, 0};
        System.out.println(uniqueOccurrences(arr1));
        // System.out.println(uniqueOccurrences(arr2));
        // System.out.println(uniqueOccurrences(arr3));
    }
}
