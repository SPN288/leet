

public class Q88mergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;     // nums1's index (the actual nums)
        int j = n - 1;     // nums2's index
        int k = m + n - 1; // nums1's index (the next filled position)
    
        while (j >= 0)
          if (i >= 0 && nums1[i] > nums2[j])
            nums1[k--] = nums1[i--];
          else
            nums1[k--] = nums2[j--];
      }
      public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3,n = 3;
        merge(nums1, m, nums2, n);
        
      }
}
