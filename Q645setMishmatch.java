public class Q645setMishmatch {
    public static int[] findErrorNums(int[] nums) {
        int [] ans=new int[2];
        int l=nums.length;
        int[] supp = new int[l+1];
        for (int i = 0; i < l; i++) {
            if(nums[i]!=supp[nums[i]]){
                supp[nums[i]]=nums[i];
            }else{ans[0]=nums[i];}
        }
        for (int i = 1; i <= nums.length; i++) {
           if(supp[i]==0){ans[1]=i;} 
         }
        return ans;
    }

    static void printer(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr1={1,2,2,4};
        int[] arr2 ={1,1};

        printer(findErrorNums(arr1));
        printer(findErrorNums(arr2));
    }
    // public int[] findErrorNums(int[] nums) {
    //     int duplicate = 0;
    
    //     for (final int num : nums) {
    //       if (nums[Math.abs(num) - 1] < 0)
    //         duplicate = Math.abs(num);
    //       else
    //         nums[Math.abs(num) - 1] *= -1;
    //     }
    
    //     for (int i = 0; i < nums.length; ++i)
    //       if (nums[i] > 0)
    //         return new int[] {duplicate, i + 1};
    
    //     throw new IllegalArgumentException();
    //   }
}
