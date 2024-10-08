public class Q189RotateArray {
    static void rotate(int[] nums,int k){
        int l=nums.length;
        if(l==0||l==1){return;}
        if(k>=l){
            while(k>l){k=k-l;}
        }
        int []d=new int[l];
        int j=0;
        for (int i = l-k; i <l; i++) {
            d[j]=nums[i];
            j++;
        }
        for (int i = 0; i < l-k; i++) {
            d[j]=nums[i];
            j++;
        }
        System.arraycopy(d, 0, nums, 0, nums.length);
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
