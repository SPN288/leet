public class Q283MoveZeros {
    public static  void moveZeroes(int[] nums) {
        int n=nums.length;
        int count=0;
        for (int i = 0; i < n; i++) {
            if(nums[i]!=0){
                nums[count]=nums[i];
                count++;
            }
        }
        for (int i = count; i < n; i++) {
            nums[i]=0;
        }
    }

    public static void main(String[] args) {
        int[] arr={0,1,0,3,12};
    }
}
