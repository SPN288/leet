import java.util.HashMap;
import java.util.Map;

public class Q2657FindThePrefixCommonArray {
    public static int[] findThePrefixCommonArray(int[] A, int[] B) {

        HashMap<Integer, Integer> hm = new HashMap<>();
        int[] a = new int[A.length];
        if (A[0] == B[0]) {
            a[0] = 1;
            hm.put(A[0], 2);

        } else {
            a[0] = 0;
            hm.put(A[0], 1);
            hm.put(B[0], 1);
        }

        for (int i = 1; i < A.length; i++) {
            if (hm.containsKey(A[i])) {
                hm.put(A[i], 1 + hm.get(A[i]));
            } else {
                hm.put(A[i], 1);
            }

            if (hm.containsKey(B[i])) {
                hm.put(B[i], 1 + hm.get(B[i]));
            } else {
                hm.put(B[i], 1);
            }
            int x = 0;
            for (Map.Entry<Integer, Integer> e : hm.entrySet()) {
                if (e.getValue() >= 2) {
                    x++;
                }
            }
            a[i] = x;

        }
        return a;

    }

    public static void main(String[] args) {
        int[] A = {1,3,2,4}; 
        int[] B = {3,1,2,4};
        findThePrefixCommonArray(A, B);
    }
}
