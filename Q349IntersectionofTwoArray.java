import java.util.ArrayList;
import java.util.HashMap;

public class Q349IntersectionofTwoArray {
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            hm.put(nums1[i],i);
        }

        ArrayList<Integer>al=new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
            if(hm.containsKey(nums2[i])){
                al.add(nums2[i]);
                hm.remove(nums2[i]);
            }
        }
        int[] a = al.stream().mapToInt(Integer::intValue).toArray();
        return a;
    }
    public static void main(String[] args) {
     ArrayList<Integer>al=new ArrayList<>();
     al.add(1);
     HashMap<Integer,Integer>hm=new HashMap<>();
        
    }
}
