import java.util.HashMap;

public class Q219ContainsDuplicate {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                if(i-hm.get(nums[i])<=k){
                    return true;
                }else{hm.put(nums[i],i);}
            }else{hm.put(nums[i],i);}
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};int k = 3;
        System.out.println(containsNearbyDuplicate(nums, k));
    }
}
