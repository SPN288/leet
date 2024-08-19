public class Q724FindPivotIndex {
    public static int pivotIndex(int[] nums) {
        int i=0;
        int l=nums.length;
        if(l==1){
            return 0;
        }
        int[] ltr=new int[l];ltr[0]=nums[0];
        int[] rtl=new int[l];rtl[l-1]=nums[l-1];
        for(i=1;i<l;i++){
            ltr[i]=ltr[i-1]+nums[i];
        }
        for(i=l-2;i>=0;i--){
            rtl[i]=rtl[i+1]+nums[i];
        }
        for(i=0;i<l;i++){
            if(ltr[i]==rtl[i]){
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,7,3,6,5,6};
        System.out.println(pivotIndex(arr));
    }
}
