

public class Q283moveZero {

    public static void moveZeroes(int[] nums) {
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
    static void printer(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={0,1,0,1,0,0,2,0};
        printer(arr);
        moveZeroes(arr);
        printer(arr);

    }
}
