import java.util.HashMap;
import java.util.Map;

public class Q1twoSum {
    public static int[] twoSum(int[] nums,int target){
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int cur =nums[i];
            int x= target -cur;
            if(map.containsKey(x)){
                return new int[]{map.get(x),i};
            }
            map.put(cur,i);

        }
        return null;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,90};
        twoSum(arr, 2);
    }
}
