public class Q11ContainerWithMostWater {
    

    public static int maxArea(int[] height) {
        if(height.length==0||height.length==1){return 0;}
        int ans=0;
        int n=0;
        for (int i = 0; i < height.length; i++) {
            for(int j=0;j<height.length;j++){
                int w=Math.min(height[i], height[j])*(j-i);
                if(w>ans){ans=w;}
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr1={1,8,6,2,5,4,8,3,7};//49
        int[] arr2 ={1,1};//1   
        System.out.println(maxArea(arr1));
        System.out.println(maxArea(arr2));
    }
}
