public class Q974sumdividedbyK {
    // public static  int subarraysDivByK(int[] nums, int k) {
    //     int count=0;
    //     for (int i = 0; i < nums.length; i++){
    //         for (int j = i; j < nums.length; j++) {
    //             int sum=0;
    //             for (int x = i; x <=j; x++){
    //                 sum+=nums[x];
    //             }
    //             if(sum%k==0||sum==0){count++;}        
    //         }
    //     }
      
      
    //     return count;
    // }

    public static  int subarraysDivByK(int[] nums, int k) {
        int ans = 0;
    int prefix = 0;
    int[] count = new int[k];
    count[0] = 1;

    for (final int num : nums) {
      prefix = (prefix + num % k + k) % k;
      ans += count[prefix];
      ++count[prefix];
    }

    return ans;
    }
    
    public static void main(String[] args) {
        int arr[]={4,5,0,-2,-3,1}; int k=1000;
         //System.out.println(subarraysDivByK(arr, k));
       System.out.println(subarraysDivByK(arr, k));
    }
}
