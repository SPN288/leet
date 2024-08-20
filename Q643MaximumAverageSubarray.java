public class Q643MaximumAverageSubarray {
    // public static double findMaxAverage(int[] nums, int k) {
    //     double max=Integer.MIN_VALUE;
    //     for (int i = 0; i <= nums.length-k; i++) {
    //         double sum=0;
    //         for (int j = i; j < i+k; j++) {
    //             sum+=nums[j];
    //         }
    //         if(sum/k>max){
    //             max=sum/k;
    //         }
    //     }
    //     return max;
    // }
    public static double findMaxAverage(int[] nums, int k) {
        int l=nums.length;
        if(l==1){return nums[0];}
        int[]help=new int[l];help[0]=nums[0];
        int i;
        for ( i = 1; i <l; i++) {
            help[i]=help[i-1]+nums[i];
            //System.out.print(" "+help[i]);
        }
        System.out.println();
        if(k==l){return (double)help[l-1]/k;}
        double max=help[k-1];
        for(i=k;i<l;i++){
            int res=help[i]-help[i-k];
            if(res>max){
                max=res;
            }
        }
        max=max/k;

        return max;
    }
    public static void main(String[] args) {
        int[] arr={4,0,4,3,3};
        int[] arr2={9,7,3,5,6,2,0,8,1,9};
        //System.out.println(findMaxAverage(arr, 5));
        System.out.println(findMaxAverage(arr2, 6));
    }
    
}
