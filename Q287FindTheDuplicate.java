public class Q287FindTheDuplicate {
    public static int findDuplicate(int[]nums){
        int[] c=new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=c[nums[i]]){
                c[nums[i]]=nums[i];
            }else return nums[i];
        }
        
        return 0;
}
    public static void main(String[] args) {
        int []nums={1,3,4,2,2};
        System.out.println(findDuplicate(nums));
    }
    
}
