public class Q11ContainerWithMostWater {
    
        // public static  int maxArea(int[] height) {
        //   int ans = 0;
        //   int l = 0;
        //   int r = height.length - 1;
      
        //   while (l < r) {
        //     final int minHeight = Math.min(height[l], height[r]);
        //     ans = Math.max(ans, minHeight * (r - l));
        //     if (height[l] < height[r])
        //       ++l;
        //     else
        //       --r;
        //   }
      
        //   return ans;
        // }


        public static  int maxArea(int[] height) {
          int i=0,j=height.length-1;
          int max = Math.abs(i-j)*Math.min(height[i], height[j]);

          while (i!=j) { 
            System.out.println("i="+i+"j="+j);
              if((Math.abs(i+1-j)*Math.min(height[i+1], height[j]))>max){
                max=Math.abs(i+1-j)*Math.min(height[i+1], height[j]);
                i++;
              }
              else if((Math.abs(i-j-1)*Math.min(height[i], height[j-1]))>max){
                max=Math.abs(i-j-1)*Math.min(height[i], height[j-1]);
                j--;
              }else{i++;}
              
          }
          return max;
        }
      

    public static void main(String[] args) {
        int[] arr1={1,8,6,2,5,4,8,3,7};//49
        int[] arr2 ={2,3,4,5,18,17,6};//17  
        //System.out.println(maxArea(arr1));
        System.out.println(maxArea(arr2));
    }
}
