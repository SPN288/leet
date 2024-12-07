public class Q509fubo {
    public static  int fib(int n) {
        if(n==0){return 0;}
        if(n==1){return 1;}
        int[] arr=new int[n+1];
        arr[0]=0;
        arr[1]=1;
        for(int i=2;i<=n;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[n];
    }
    public static void main(String[] args) {
        System.out.println(fib(10));
    }
}
