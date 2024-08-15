
public class Q1732FindTheHighestAltitude {

    public static int largestAltitude(int[] gain) {
        int ans = 0;
        int l = gain.length;
        int[] height = new int[l + 1];
        height[0] = 0;
        int max = Integer.MIN_VALUE;
        int i = 0;
        for (i = 0; i < l; i++) {
            ans += gain[i];
            height[i + 1] = ans;
        }
        for (i = 0; i < height.length; i++) {
            if (height[i] > max) {
                max = height[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {-5, 1, 5, 0, -7};
        System.out.println(largestAltitude(arr));
    }
}
