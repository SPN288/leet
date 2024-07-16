public class Q55jumpCase {
    public static  boolean canJump(int[] nums) {
        for(int i=0;i<nums.length;i=i+nums[i]){
            if(nums.length==1){return true;}
            else if(nums.length==0){return false;}
            if(nums[i]==0){return false;}
            
            if(i+nums[i]==nums.length-1){return true;}
            
        }
        return false;
    }

    public static void main(String[] args) {
        int []nums1 = {2,3,1,2,4};
        int []nums2 = {3,2,1,0,4};
        System.out.println(canJump(nums1));
        System.out.println(canJump(nums2));

    }
    
}
