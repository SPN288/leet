
public class Q88mergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0, k = 0;
        int[] arr = new int[nums1.length];
        for (int i = 0; i < arr.length; i++) {
            if (nums1[j] == 0) {
                arr[i] = nums2[k];
                j++;
                k++;
            } else if (nums1[j] <= nums2[k]) {
                arr[i] = nums1[j];
                j++;
            } else {
                arr[i] = nums2[k];
                k++;
            }
        }
        for (int l = 0; l < arr.length; l++) {
            nums1[l]=arr[l];
            System.out.print(nums1[l]+"");
        }

    }

    public static void main(String[] args) {
        int[] nums1 = {0};
        int[] nums2 = {1};
        int m = 3, n = 3;
        merge(nums1, m, nums2, n);

    }
}
