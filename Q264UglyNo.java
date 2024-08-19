
import java.util.HashMap;

public class Q264UglyNo {

    static boolean isPrime(int x) {
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }

        return true;
    }

    // public static int nthUglyNumber(int n) {
    //     if (n == 1) {
    //         return 1;
    //     }
    //     if (n == 2) {
    //         return 2;
    //     }
    //     if (n == 3) {
    //         return 3;
    //     }
    //     int[] arr = new int[n];
    //     arr[0] = 1;
    //     arr[1] = 2;
    //     arr[2] = 3;
    //     int k = 3;
    //     int i=4;
    //     HashMap<Integer, Integer> hm = new HashMap<>();
    //     hm.put(2, 2);
    //     hm.put(3, 3);
    //     hm.put(5, 5);

    //     while (k<n) {
    //         if (isPrime(i)&&i>5) {
    //             i++;
    //             continue;
    //         }
    //         boolean check = true;
    //         for (int j = 2; j <= i / 2; j++) {
    //             if (isPrime(j) && i % j == 0) {
    //                 if (hm.containsKey(j)) {
    //                     continue;
    //                 } else {
    //                     check = false;
    //                 }
    //             }
    //         }
    //         if (check == true) {
    //             arr[k] = i;
    //             k++;
    //         }i++;
    //     }
    //     for ( i = 0; i < n; i++) {
    //         System.out.print(arr[i] + " ");
    //     }
    //     System.out.println();

    //     return arr[n - 1];
    // }
    public static int nthUglyNumber(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        if (n == 3) {
            return 3;
        }
        int ans=0;
        int k = 3;
        int i=4;
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(2, 2);
        hm.put(3, 3);
        hm.put(5, 5);

        while (k<n) {
            if (isPrime(i)&&i>5) {
                i++;
                continue;
            }
            boolean check = true;
            for (int j = 2; j <= i / 2; j++) {
                if (isPrime(j) && i % j == 0) {
                    if (hm.containsKey(j)) {
                        continue;
                    } else {
                        check = false;
                    }
                }
            }
            if (check == true) {
                ans = i;
                k++;
            }i++;
        }
        

        return ans;
    }
    public static void main(String[] args) {
        System.out.println(nthUglyNumber(124));
        //System.out.println(isPrime(4));
    }
}
