import java.util.HashMap;
public class Q136SingleNumber {
    static int singleNumber2(int[] nums){
        HashMap<Integer,Integer> mm=new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            if(mm.containsKey(nums[i])){
                mm.remove(0,nums[i]);
            }else{mm.put(0,nums[i]);}
            
        }
        System.out.println(mm);
        
        return (mm.get(0));
    }
    static int singleNumber(int[] nums){
        int[] counter=new int[10];
        for (int i = 0; i < nums.length; i++) {
            counter[nums[i]]++;
        }
        int ans=0;
        for (int i = 0; i < 10; i++) {
            if(counter[i]==1){ans=i;}
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {2,1,2};
        //  int ans=singleNumber(nums);
        //  System.out.println(ans);
        HashMap<Integer,Integer> lol=new HashMap<>();
        lol.put(1, 4);
        lol.put(2, 1);
        lol.put(3, 2);
        lol.put(4, 1);
        lol.put(5, 2);
        System.out.println(lol);
        
        int d=lol.get(2);
        System.out.println(d);
    }
}
