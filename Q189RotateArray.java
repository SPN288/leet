public class Q189RotateArray {
    static void rotate(int[] nums,int k){
        int l=nums.length;
        if(l==0||l==1){return;}
        for (int i = 1; i <= k; i++) {
            int o=nums[l-1];
            for (int j = l-1; j >0; j--) {
                nums[j]=nums[j-1];
            }
            nums[0]=o;
        }
    }

    static void printer(int [] nums){
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7};
        printer(nums);
        rotate(nums,3);
        
        printer(nums);
    }
}
