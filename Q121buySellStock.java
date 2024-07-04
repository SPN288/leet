
public class Q121buySellStock {

    static int stock(int arr[]) {
        int min = 0;

        int profit = 0;
        int x=arr.length;
        
        for (int i = 0; i < x; i++) {
            if(arr[i]<arr[min]){
                min=i;
            }
            if(arr[i]-arr[min]>profit){
                profit=arr[i]-arr[min];
            }
            
        }
        return profit;
    }

    public static void main(String[] args) {
        int arr[] = {7, 1, 5, 3, 6, 4};
        System.out.println(stock(arr));
    }
}
