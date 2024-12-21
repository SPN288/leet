import java.util.HashMap;

public class Q41FirstPositiveNumber {
    public static  int firstMissingPositive(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                hm.put(nums[i],nums[i]);
            }
        }
        for(int i=1;i<=2147483647;i++){
            if(!hm.containsKey(i)){
                return i;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        int[] nums = {3,4,-1,1};
        System.err.println(firstMissingPositive(nums));
    }
}
