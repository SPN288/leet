public class Q11ContainerWithMostWater {
    

    // public static int maxArea(int[] height) {
    //     int s=height.length;
    //     if(s==0||s==1){return 0;}
    //     int ans=0;
    //     int n=0;
    //     for (int i = 0; i <s; i++) {
    //         for(int j=0;j<s;j++){
    //             int w=Math.min(height[i], height[j])*(j-i);
    //             if(w>ans){ans=w;}
    //         }
    //     }
    //     return ans;
    // }

    // public static int maxArea(int[] height) {
    //     int s=height.length;
    //     if(s==0||s==1){return 0;}
    //     int ans=0;
    //     int i;
    //     int j=s-1;
    //     int maxf=0;
    //     int maxr=j;
    //     for ( i = 0; i < s;i++) {
    //         if(height[i]>height[maxf]){
    //             maxf=i;
    //         }
    //         if(height[j]>height[maxr]){
    //             maxr=j;
    //         }
    //         int w=Math.min(height[maxf], height[maxr])*(maxr-maxf);
    //              if(w>ans){ans=w;}
    //             j--;
    //     }
    //     return ans;
    // }
    
        public static  int maxArea(int[] height) {
          int ans = 0;
          int l = 0;
          int r = height.length - 1;
      
          while (l < r) {
            final int minHeight = Math.min(height[l], height[r]);
            ans = Math.max(ans, minHeight * (r - l));
            if (height[l] < height[r])
              ++l;
            else
              --r;
          }
      
          return ans;
        }
      

    public static void main(String[] args) {
        int[] arr1={1,8,6,2,5,4,8,3,7};//49
        int[] arr2 ={2,3,4,5,18,17,6};//17  
        System.out.println(maxArea(arr1));
        System.out.println(maxArea(arr2));
    }
}
