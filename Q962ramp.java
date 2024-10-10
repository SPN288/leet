

public class Q962ramp {
    public static int maxWidthRamp(int[] nums) {
        int ans=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if(nums[j]>=nums[i]){
                    int m=j-i;
                    if(m>ans){
                        ans=m;
                    }
                }
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] arr={9,8,1,0,1,9,4,0,4,1};
        System.out.println(maxWidthRamp(arr));
    }
}
