class Q2270NoOfWays{
    public static int waysToSplitArray(int[] nums) {
        int l=nums.length;
        long[] f=new long[l];
        f[0]=nums[0];
        long[] b=new long[l];
        b[l-1]=nums[l-1];
        int i;
        for( i=1;i<l;i++){
            f[i]=f[i-1]+nums[i];
        }
        
        for( i=l-2;i>=0;i--){
            b[i]=b[i+1]+nums[i];
        }

        int ans=0;
        for(i=0;i<l-1;i++){
            if(f[i]>=b[i+1]){
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        
    }
}