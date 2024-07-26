
import java.util.HashMap;

public class Q2399CheckDistanceBetweenSameLetters {

    public static boolean checkDistances(String s, int[] distance) {
        HashMap<Character, Integer> mymap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (!mymap.containsKey(s.charAt(i))) {
                mymap.put(s.charAt(i), i);
            } else if (distance[(int) s.charAt(i) - 97] != i - mymap.get(s.charAt(i)) - 1) {
                return false;

            }

        }

        return true;
    }

    public static void main(String[] args) {
        int d[] = {1, 3, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int p[] = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        System.out.println(checkDistances("abaccb", d));
        System.out.println(checkDistances("aa", p));
    }
}
