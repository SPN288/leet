import java.util.*;

public class Q1431 {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ml=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < candies.length; i++) {
            if(candies[i]>max){max=candies[i];}
        }

        for (int j = 0; j < candies.length; j++) {
            if(max<=extraCandies+candies[j]){
                ml.add(true);
            }else{
                ml.add(false);
            }
        }
        System.out.println(ml);
        
        
        return ml;


    }

    public static void main(String[] args) {
        int[] arr={2,3,5,1,3};
        System.out.println(kidsWithCandies(arr, 3));
    }
}
