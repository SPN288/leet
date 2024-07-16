public class Q168exelsheettitle {
    public static  String convertToTitle(int columnNumber) {
        String ans="";
        char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        if(columnNumber>=1&&columnNumber<=26){
            ans=ans+alphabet[columnNumber-1];
            return ans;
        }
        
        if(columnNumber>26){
            return (convertToTitle(columnNumber/26)+ans);
        }
            // ans+=alphabet[(columnNumber/26)-1];
            //ans+=alphabet[(columnNumber%26)-1];

        // while(columnNumber>999){
        //     int q=columnNumber/1000;
        //     ans+=alphabet[(q/26)-1];
        //     ans+=alphabet[(q%26)-1];
        //     columnNumber=columnNumber%1000;
        // }
        


        return ans;
    }

    static  int search(int[] arr,int k){

        for (int i = 0; i < arr.length; i++) {
            
            if(arr[i]==k){
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
       
        // System.out.println(convertToTitle(1));//A
        //System.out.println(convertToTitle(28));//AB
        //System.out.println(convertToTitle(701));//ZY
        //System.out.println(convertToTitle(2147483647));
        //System.out.println((double)2147483647/26);
        int a=702;
        int b=26;
        System.out.println(a/b);
        System.out.println(a%b);

        
       
        
    }
}
