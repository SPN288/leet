public class Q493reversePairs {
    static public int reversePairs(int[] nums) {
        int ans=0;long k=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j= i+1; j< nums.length; j++) {
                
                k=2*(long)nums[j];
                
                if(nums[i]>k){
                    ans++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,2,3,1};//2
        int[] nums2= {2147483647,2147483647,2147483647,2147483647,2147483647,2147483647};//3
        System.out.println(reversePairs(nums));
        System.out.println(reversePairs(nums2));
    }
}
