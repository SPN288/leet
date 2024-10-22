import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q1403subsequence {
    
    public static  List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int l=nums.length;
        int[] sum =new int[l];
        int[] lum =new int[l];
        List<Integer> ans=new ArrayList<>();
        sum[0]=nums[0];
        lum[l-1]=nums[l-1];
        int j=l-2;
        for(int i=1;i<l;i++){
            sum[i]=nums[i]+sum[i-1];
            lum[j]=nums[j]+lum[j+1];j--;
        }
        int k=0;
        for(int i=l-1;i>0;i--){
            if(lum[i]>sum[i-1]){
                k=i;
                break;
            }
        }
        //System.out.println("k="+k);
        for(int i=l-1;i>=k;i--){
            ans.add(nums[i]);
        }
        return ans;


    }

    public static void main(String[] args) {
        int[] arr={4,4,7,6,7};
        System.out.println(minSubsequence(arr));
        
    }
}