import java.util.*;
public class Q1679MaxNumberofksumpairs {
    public static int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0,j=nums.length-1,count=0;
        while(i<j){
            int x=nums[i]+nums[j];
            if(x==k){
                count++;
                i++;j--;
            }
            else if(nums[i]+nums[j]>k){
                j--;
            }
            else if(nums[i]+nums[j]<k){
                i++;
            }else{i++;}
        }
        return count;
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4};
        System.out.println(maxOperations(arr, 5));
    }
}
