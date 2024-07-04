

public class Q122sellStock2 {
    public static int maxProfit(int[] prices) {
     int profit=0;
        int min=0;
        int max=0;
        for (int i = 0; i < prices.length-1; i++) {
            if(prices[i+1]<prices[i]){
                profit=profit+prices[max]-prices[min];
                min=i+1;
                max=i+1;
            }else{max=i+1;}
        }
        int p=prices[prices.length-1]-prices[min];
        if(p>0){
            return p+profit; 
        }
     return profit;   
    }
    
    public static void main(String[] args) {
        int prices1[]={7,1,5,3,6,4};//7
        int prices2[]={1,2,3,4,5};//4
        int prices3[]={7,6,4,3,1};//0
        int prices4[]={6,1,3,2,4,7};//7
        System.out.println("profit 1 = "+ maxProfit(prices1));
        System.out.println("profit 2 = "+ maxProfit(prices2));
        System.out.println("profit 4 = "+ maxProfit(prices4));
    }
    
    
}

// public static int maxProfit(int[] prices) {
//     int profit=0;
//        int min=0;
//        int max=0;
//        for (int i = 0; i < prices.length-1; i++) {
//            if(prices[i+1]<prices[i]){
//                profit=profit+prices[max]-prices[min];
//                min=i+1;
//                max=i+1;
//            }else{max=i+1;}
//        }
//     return profit;   
//    }