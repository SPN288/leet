

public class Q45JumpGameII{
    static void print(int[][]a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j]+" ");
            }System.out.println();
        }
    }
    public static int jump(int[] nums) {
        int l=nums.length;
        int ans=Integer.MAX_VALUE;
        int[][] a=new int[l][l];
        for(int i=0;i<l;i++){
            int count=1;
            for (int j = i+1;j<l && j <=i+nums[i] ; j++) {
                a[i][j]=count;count++;
            }
            
        }
        print(a);
        for (int i = 0; i < l; i++) {
            int count=1;
            if(a[i][l-1]>0){
                int j=l-1;
                int k=i;
                while(j!=0){
                    if(a[k][j]!=1){
                        j--;
                    }else{k--;count++;}
                }
            }
            ans=Math.min(ans, count);
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        System.out.println(jump(nums));
    }
}