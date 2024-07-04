
import java.util.ArrayList;

public class Q66PlusOne {

    public static int[] plusOn(int[] digits) {
        int l = digits.length;
        if (digits[0] == 9) {
        }
        int[] re = new int[l + 1];
        re[l] = digits[l - 1] + 1;
        for (int i = l; 1 < i; i = i - 1) {
            if (re[i] > 9) {
                re[i - 1] = digits[i - 2] + 1;
                re[i] = re[i] % 10;
            } else {
                re[i - 1] = digits[i - 2];
            }
        }
        if (re[1] > 9) {
            re[0] = 1;
            re[1] = re[1] % 10;
        }
        return re;
    }

    public static ArrayList<Integer> plusOne(int[] digits) {
        int l = digits.length;

        ArrayList<Integer> re = new ArrayList<>();
        re.add(digits[l - 1] + 1);
        for (int i = l-2; 0 <= i; i--) {
            if (re.get(0) > 9) {
                re.add(0, digits[i] + 1);
                re.set(1, (re.get(1) % 10));
            } else {
                re.add(0, digits[i]);
            }
        }
        if (re.get(0) > 9) {
            re.add(0,1);
            re.set(1, (re.get(1) % 10));
        }
        System.out.println(re);
        return re;
    }

    public static void main(String[] args) {
        int[] arr = {8, 9, 9, 9, 9};
        plusOne(arr);
    }
}
