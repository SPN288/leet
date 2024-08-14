public class Q334IncreasingTripletSubsequence {
    public static boolean increasingTriplet(int[] nums) {
        int i=Integer.MAX_VALUE;
        int j=Integer.MAX_VALUE;
        int k=Integer.MIN_VALUE;
        for (int a = 0; a < nums.length; a++) {
            if(nums[a]<=i){
                i=nums[a];
            }
            else if(nums[a]>i && nums[a]<j){j=nums[a];}
            else if(nums[a]>j){k=nums[a];}
        }
        //System.out.println("i->"+i+" j->"+j+" k->"+k);
        if(k!=Integer.MIN_VALUE){return true;}
        
        return false;
    }
    public static void main(String[] args) {
        int [] arr={2,1,5,10,4,3,6};
        System.out.println(increasingTriplet(arr));
    }
}
