import java.util.HashMap;

public class Q2056Formsmallestnumber {
    
    public static  int minNumber(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> n1=new HashMap<>();
        int i;
        int min=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        int min3=Integer.MAX_VALUE;
        for(i=0;i<nums1.length;i++){
            n1.put(nums1[i],nums1[i]);
            if(nums1[i]<min){
                min=nums1[i];
            }
        }
        for(i=0;i<nums2.length;i++){
            
            if(nums2[i]<min2){
                min2=nums2[i];
            }
            if(n1.containsKey(nums2[i]) && nums2[i]<min3){
                min3=nums2[i];
            }
        }
         i=Math.min(min,min2);
         i=i*10;
         i=i+Math.max(min2,min);
        return Math.min(i,min3);
    }
    public static void main(String[] args) {
        int[] nums1 = {4,1,3};
        int[] nums2 = {5,7};
        System.out.println(minNumber(nums1, nums2));
    }
}
