public class Q643MaximumAverageSubarray {
    public static double findMaxAverage(int[] nums, int k) {
        double max=Integer.MIN_VALUE;
        for (int i = 0; i <= nums.length-k; i++) {
            double sum=0;
            for (int j = i; j < i+k; j++) {
                sum+=nums[j];
            }
            if(sum/k>max){
                max=sum/k;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr={5};
        System.out.println(findMaxAverage(arr, 1));
    }
    
}
