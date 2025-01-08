
import java.util.HashMap;
import java.util.Stack;

public class Q496NextGreaterElement {

    static int[] findg(int[] arr) {
        int[] ans = new int[arr.length];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = -1;
        }
        Stack<Integer> st = new Stack<>();
        st.push(arr[arr.length - 1]);

        for (int i = arr.length - 2; i >= 0; i--) {
            while (!st.isEmpty()) {
                if (st.peek() < arr[i]) {
                    st.pop();
                } else {
                    break;
                }
            }
            if (st.isEmpty()) {
                st.push(arr[i]);
            } else {
                ans[i] = st.peek();
                st.push(arr[i]);
            }
        }
        return ans;
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int [] help=findg(nums2);
        HashMap<Integer,Integer> hm=new HashMap<>();
        for (int i = 0; i < help.length; i++) {
            hm.put(nums2[i], help[i]);
        }
        int[] ans=new int[nums1.length];
        for (int i = 0; i < ans.length; i++) {
            ans[i]=hm.get(nums1[i]);
        }
        return ans;
    }

    static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int []nums1 = {4,1,2}; int nums2[] = {1,3,4,2};
        print(nextGreaterElement(nums1, nums2));
    }
}
